package beans;

import javax.persistence.*;

@Entity
@Table (name = "Brands")
public class Brand {

    @Id
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @OneToOne(optional = false, mappedBy="brand")
    public Car car;

    public Brand(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
