import beans.Brand;
import beans.Car;
import dao.CarDao;
import dao.TransactionUtil;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import services.AdminService;

import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;

public class JpaBookRepositoryTest {
    Session session;

    @Before
    public void openConnection(){
        TransactionUtil transactionUtil = new TransactionUtil();
        session = transactionUtil.beginTransaction();
    }

    @Test
    public void testFindById() {
        Brand brand = new Brand("bmw","x2");
        Car car = new Car(10,12,brand);
       // Car car = new Car();
        AdminService adminService = new AdminService();
        adminService.addNewCar(car,brand);
        CarDao carDao = new CarDao(session);
        assertEquals(car,carDao.findLastInserted());
    }
}