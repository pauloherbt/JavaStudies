package miniprojJDBC.model.dao.impl;

import exercises.DataBasee.db.DB;
import exercises.DataBasee.db.DbException;
import miniprojJDBC.model.dao.ISellerDao;
import miniprojJDBC.model.entities.Department;
import miniprojJDBC.model.entities.Seller;

import java.sql.*;
import java.util.*;

public class SellerDao implements ISellerDao {

    private Connection connection;

    public SellerDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Seller obj) {
        String query="insert into seller (Name,Email,BirthDate,BaseSalary,DepartmentId) values (?,?,?,?,?) ";
        PreparedStatement statement=null;
        try{
            statement=connection.prepareStatement(query);
            statement.setString(1,obj.getName());
            statement.setString(2,obj.getEmail());
            statement.setDate(3,obj.getBirthdayDate());
            statement.setDouble(4,obj.getBaseSalary());
            statement.setInt(5,obj.getDepartment().getId());
            statement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
        }
    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Seller findById(int id) {
        String query= "select s.*, d.Name as Dep_name from seller s join department d on s.DepartmentId=d.Id where s.Id=(?)";
        PreparedStatement statement=null;
        ResultSet rs=null;
        Seller seller=null;
        Department dep=null;
        try {
            statement= connection.prepareStatement(query);
            statement.setInt(1,id);
            rs=statement.executeQuery();
            if(rs.next()){
                dep=instantiateDepartment(rs);
                seller = instantiateSeller(rs,dep);
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
            DB.closeResultSet(rs);
        }
        return seller;
    }
    @Override
    public List<Seller> findAll() {
        ResultSet rs=null;
        Statement st=null;
        Department dep=null;
        List<Seller> sellers = new ArrayList<>();
        Map<Integer,Department> deps = new HashMap<>(); //id-dep
        try{
            st= connection.createStatement();
            rs=st.executeQuery("select s.*, d.Name as Dep_name from seller s join department d on s.DepartmentId=d.Id order by s.Id");
            while (rs.next()){
                dep = deps.get(rs.getInt("DepartmentId"));
                if(dep==null){
                    dep=instantiateDepartment(rs);
                    deps.put(rs.getInt("DepartmentId"),dep);
                }
                sellers.add(instantiateSeller(rs,dep));
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return sellers;
    }
    @Override
    public List<Seller> findByDepartment(Department dep) {
        ResultSet rs = null;
        PreparedStatement st=null;
        List<Seller> sellers = new ArrayList<>();
        try{
            st=connection.prepareStatement("select s.*, d.Name as Dep_name " +
                    "from seller s " +
                    "join department d on s.DepartmentId=d.Id " +
                    "where s.DepartmentId=(?) order by d.Id");
            st.setInt(1,dep.getId());
            rs=st.executeQuery();
            Map<Integer,Department> deps = new HashMap<>(); //id-department
            while(rs.next()){
               Department depaux=deps.get(rs.getInt("DepartmentId")); //verifico se o dep ja esta no map
                if(depaux==null){ //se nao estiver eu insiro com sua respec chave
                    depaux=instantiateDepartment(rs);
                    deps.put(rs.getInt("DepartmentId"),depaux);
                }//se ele nao entrar no if o depaux ja estara com o dep correto
                sellers.add(instantiateSeller(rs,depaux));

                //minha versao
                /* if(rs.first()) //instancia o dep na primeira ocorrencia
                    dep=instantiateDepartment(rs);

                sellers.add(instantiateSeller(rs,dep)); //instancia n sellers com o mesmo department mantendo a ligação*/
            }
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return sellers;
    }
    private Seller instantiateSeller(ResultSet rs,Department dep) throws SQLException{
        return new Seller(rs.getInt("Id"),rs.getString("Name")
                ,rs.getString("Email"),rs.getDate("BirthDate")
                ,rs.getDouble("BaseSalary"),dep );
    }
    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        return new Department(rs.getInt("DepartmentId"),rs.getString("Dep_name"));
    }


}
