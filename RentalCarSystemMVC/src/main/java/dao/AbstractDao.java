package dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings("unchecked")
public abstract class AbstractDao<E> implements GenericDao<E> {

    private final Class<E> entityClass;

    public AbstractDao(Session session) {
        this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
                this.session = session;
    }

    @Autowired
    private Session session;

    protected Session getSession() {
        return this.session;
    }

    @Override
    public E findById(final Serializable id) {
        return (E) getSession().get(this.entityClass, id);
    }

    public E findLastInserted(){
        Query query = getSession().createQuery("from Car where id = (select max(id) from Car)");
        return (E) query.list().get(0);
    }

    @Override
    public Serializable save(E entity) {
        return getSession().save(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(E entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteAll() {
        List<E> entities = findAll();
        for (E entity : entities) {
            getSession().delete(entity);
        }
    }

    @Override
    public List<E> findAll() {
        return getSession().createCriteria(this.entityClass).list();
    }

    @Override
    public List<E> findAllByExample(E entity) {
        Example example = Example.create(entity).ignoreCase().enableLike().excludeZeroes();
        return getSession().createCriteria(this.entityClass).add(example).list();
    }

    @Override
    public void clear() {
        getSession().clear();

    }

    @Override
    public void flush() {
        getSession().flush();

    }

}