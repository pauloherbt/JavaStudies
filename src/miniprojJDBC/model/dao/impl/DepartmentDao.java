package miniprojJDBC.model.dao.impl;

import javacompleto.DataBasee.db.DB;
import javacompleto.DataBasee.db.DbException;
import miniprojJDBC.model.dao.IDepartmentDao;
import miniprojJDBC.model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao implements IDepartmentDao {
    private Connection connection;

    public DepartmentDao(Connection connection) {
        this.connection=connection;
    }

    @Override
    public void insert(Department obj) {
        String query = "insert into department (Name) values (?)";
        PreparedStatement statement=null;
        try{
            statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,obj.getName());
            int rowsA= statement.executeUpdate();
            if(rowsA>0){
                ResultSet rs = statement.getGeneratedKeys();
                    if(rs.next()){
                        obj.setId(rs.getInt(1));
                    }
                    DB.closeResultSet(rs);
            }
            else
                throw new DbException("insertion failed");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
        }
    }
    @Override
    public void update(Department obj) {
        String query = "update department set Name = ? where id=?";
        PreparedStatement statement=null;
        try{
            statement = connection.prepareStatement(query);
            statement.setString(1,obj.getName());
            statement.setInt(2,obj.getId());
            statement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
        }
    }
    @Override
    public void deleteById(int id) {
        String query = "delete from department where Id=?";
        PreparedStatement statement=null;
        try{
            statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            statement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
        }
    }
    @Override
    public Department findById(int id) {
        String query = "select * from department where Id=?";
        PreparedStatement statement=null;
        Department dep=null;
        ResultSet rs;
        try{
            statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            rs=statement.executeQuery();
            if(rs.next())
                dep=instantiateDepartment(rs);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        finally {
            DB.closeStatement(statement);
        }
        return dep;
    }
    @Override
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();
        ResultSet rs=null;
        Statement st=null;
        try{
            st=connection.createStatement();
            rs=st.executeQuery("select * from department");
            while(rs.next()){
                departments.add(instantiateDepartment(rs));
            }
        }catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return departments;
    }
    private Department instantiateDepartment(ResultSet rs) throws SQLException{
        return new Department(rs.getInt("Id"),rs.getString("Name"));
    }
}
