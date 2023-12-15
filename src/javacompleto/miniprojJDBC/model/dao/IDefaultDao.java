package javacompleto.miniprojJDBC.model.dao;

import java.util.List;

public interface IDefaultDao <T>{
    void insert(T obj);
    void update(T obj);
    void deleteById(int id);
    T findById(int id);
    List<T> findAll();
}
