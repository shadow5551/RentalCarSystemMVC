package beans;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table (name = "Cars")
public class Car extends BeanId implements Serializable{

    @Column(name = "countOfCars")
    private int countOfCars;

    @Column(name = "pricePerDay")
    private int pricePerDay;

    @OneToOne(optional = false)
    @JoinColumn(name="brand_id", unique = true, nullable = false)
    private Brand brand;


    public Car(int countOfCars, int pricePerDay) {
        this.countOfCars = countOfCars;
        this.pricePerDay = pricePerDay;
    }

    public Car(int countOfCars) {
        this.countOfCars = countOfCars;
    }

    public Car(int countOfCars, int pricePerDay, Brand brand) {
        this.countOfCars = countOfCars;
        this.pricePerDay = pricePerDay;
        this.brand = brand;

    }



    public Car() {
    }



    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    public int getCountOfCars() {
        return countOfCars;
    }

    public void setCountOfCars(int countOfCars) {
        this.countOfCars = countOfCars;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if(this.getClass() != other.getClass()) return false;
        Car otherObj = (Car) other;
        if (!Objects.equals(this.getPricePerDay(), otherObj.getPricePerDay())) return false;
        if (!Objects.equals(this.getCountOfCars(), otherObj.getCountOfCars())) return false;
        return true;
    }

}
