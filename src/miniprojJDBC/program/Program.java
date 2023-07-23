package miniprojJDBC.program;

import miniprojJDBC.model.dao.FactoryDao;
import miniprojJDBC.model.dao.impl.DepartmentDao;
import miniprojJDBC.model.dao.impl.SellerDao;
import miniprojJDBC.model.entities.Department;
import miniprojJDBC.model.entities.Seller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        Department dep = new Department(1,null);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Seller seller = new Seller(1,"peaga","ph@mail.com",new Date(sdf.parse("05/04/2004").getTime()),1500,dep);
        SellerDao sellDao = FactoryDao.getSellerDao();
        DepartmentDao depDao = FactoryDao.getDepartmentDao();
        //SELLER TEST find by id
        seller=sellDao.findById(2);
        System.out.println(seller);
        //SELLER TEST find by dep
        sellDao.findByDepartment(dep).forEach(System.out::println);
        //test find all
        sellDao.findAll().forEach(System.out::println);

    }
}
