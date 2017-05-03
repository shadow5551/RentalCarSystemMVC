package dao;

import beans.Brand;
import beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

public class BrandDao extends AbstractDao<Brand> {

    public BrandDao(Session session) {
        super(session);
    }

    @Override
    public Serializable save(Brand entity) {
        return super.save(entity);
    }

    @Override
    public void saveOrUpdate(Brand entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Brand entity) {
        super.delete(entity);
    }

    @Override
    public List<Brand> findAll() {
        return super.findAll();
    }

    @Override
    public List<Brand> findAllByExample(Brand entity) {
        return super.findAllByExample(entity);
    }
}