package javacompleto.miniprojJDBC.model.dao;

import javacompleto.miniprojJDBC.model.entities.Department;
import javacompleto.miniprojJDBC.model.entities.Seller;

import java.util.List;

public interface ISellerDao extends IDefaultDao<Seller> {
    List<Seller> findByDepartment(Department depd);

}
