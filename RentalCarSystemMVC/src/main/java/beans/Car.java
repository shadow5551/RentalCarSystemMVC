package beans;


import javax.persistence.*;

@Entity
@Table (name = "Cars")
public class Car {


    @Id
    private int id;

    @Column(name = "countOfCars")
    private int countOfCars;

    @Column(name = "pricePerDay")
    private int pricePerDay;

    @OneToOne(optional = false)
    @JoinColumn(name="brand_id", unique = true, nullable = false)
    private Brand brand;

    @OneToOne(optional = false, mappedBy="car")
    public Order order;

    public Car(int id, int countOfCars, int pricePerDay) {
        this.id = id;
        this.countOfCars = countOfCars;
        this.pricePerDay = pricePerDay;
    }

    public Car() {
    }


    public void setId(int id) {
        this.id = id;
    }

    public Car(int id) {
        this.id = id;
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
    public int hashCode() {
        return 76+13*id;
    }


    public Integer getId() {
        return id;
    }
}
