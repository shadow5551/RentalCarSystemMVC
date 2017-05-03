package services;

import beans.Brand;
import beans.Car;
import dao.BrandDao;
import dao.CarDao;
import dao.HibernateUtil;
import dao.TransactionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;


public class AdminService {

    @Transactional
    public void addNewCar(Car car, Brand brand){
        TransactionUtil transactionUtil = new TransactionUtil();
        Session session = transactionUtil.beginTransaction();
        BrandDao brandDao = new BrandDao(session);
        brandDao.save(brand);
        CarDao carDao = new CarDao(session);
        carDao.save(car);
        transactionUtil.endTransaction(session);
    }
}
