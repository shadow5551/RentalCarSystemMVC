package validation;

import beans.Car;
import dao.CarDao;

import java.util.List;

/**
 * Created by dima on 4.5.17.
 */
public class ValidateCar implements Validatable<Car> {

    @Override
    public boolean validate(Car object) {

        List list = new List<Car>;
        //CarDao carDao = new CarDao();
        return false;
    }
}
