package beans;

import javax.persistence.*;

@Entity
@Table (name = "Brands")
public class Brand extends BeanId{


    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    public Brand(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public Brand(Integer id, String brand, String model, Car car) {
        super(id);
        this.brand = brand;
        this.model = model;
    }

    public Brand() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
