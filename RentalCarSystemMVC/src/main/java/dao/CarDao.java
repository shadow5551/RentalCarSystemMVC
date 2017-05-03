package dao;


import beans.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class CarDao extends AbstractDao<Car> {
    public CarDao(Session session) {
        super(session);
    }

    @Override
    public Serializable save(Car entity) {
        return super.save(entity);
    }

    @Override
    public void saveOrUpdate(Car entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Car entity) {
        super.delete(entity);
    }

    @Override
    public Car findLastInserted() {
        return super.findLastInserted();
    }

    @Override
    public List<Car> findAll() {
        return super.findAll();
    }
}
