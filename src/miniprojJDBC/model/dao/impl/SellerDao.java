package miniprojJDBC.model.dao.impl;

import exercises.DataBasee.db.DB;
import miniprojJDBC.model.dao.ISellerDao;
import miniprojJDBC.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
