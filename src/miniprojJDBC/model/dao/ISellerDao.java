package miniprojJDBC.model.dao;

import miniprojJDBC.model.entities.Department;
import miniprojJDBC.model.entities.Seller;

import java.util.List;

public interface ISellerDao extends IDefaultDao<Seller> {
    List<Seller> findByDepartment(Department depd);

}
