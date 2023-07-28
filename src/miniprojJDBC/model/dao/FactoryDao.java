package miniprojJDBC.model.dao;

import javacompleto.DataBasee.db.DB;
import miniprojJDBC.model.dao.impl.DepartmentDao;
import miniprojJDBC.model.dao.impl.SellerDao;

public class FactoryDao {
    public static DepartmentDao getDepartmentDao(){
        return new DepartmentDao(DB.getConnection());
    }
    public static SellerDao getSellerDao(){
        return new SellerDao(DB.getConnection());
    }
}
