package miniprojJDBC.program;

import miniprojJDBC.model.dao.FactoryDao;
import miniprojJDBC.model.dao.impl.DepartmentDao;
import miniprojJDBC.model.entities.Department;

public class TestDepartment {
    public static void main(String[] args) {
        DepartmentDao depDao= FactoryDao.getDepartmentDao();
        //teste insert

        Department dep= new Department(0,"Geeks");
        depDao.insert(dep);
        System.out.println(depDao.findAll());
        System.out.println(depDao.findById(2));
        dep=depDao.findById(dep.getId());
        dep.setName("Totvs");
        depDao.update(dep);
        depDao.deleteById(7);
        //passed
    }
}
