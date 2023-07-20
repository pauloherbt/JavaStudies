package miniprojJDBC.model.dao.impl;

import exercises.DataBasee.db.DB;
import miniprojJDBC.model.dao.IDepartmentDao;
import miniprojJDBC.model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            statement = connection.prepareStatement(query);
            statement.setString(1,obj.getName());
            statement.executeUpdate();
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
        return null;
    }
    private Department instantiateDepartment(ResultSet rs) throws SQLException{
        return new Department(rs.getInt("Id"),rs.getString("Name"));
    }
}
