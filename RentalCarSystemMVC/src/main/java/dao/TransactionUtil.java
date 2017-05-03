package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by dima on 3.5.17.
 */
public class TransactionUtil {

    public Session beginTransaction(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }

    public boolean endTransaction(Session session){
        session.getTransaction().commit();
        session.close();
        return true;
    }
}
