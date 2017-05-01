package beans;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table (name = "Orders")
public class Order {

    @Id
    private int id;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "clarification")
    private String clarification;

    @Column(name = "price")
    private int price;

    @Column(name = "repairPrice")
    private int repairPrice;

    @OneToOne(optional = false)
    @JoinColumn(name="id", unique = true, nullable = false)
    private OrderStatus orderStatus;

    @OneToOne(optional = false)
    @JoinColumn(name="id", unique = true, nullable = false)
    private Car car;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
    private Set<User> users;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getClarification() {
        return clarification;
    }

    public void setClarification(String clarification) {
        this.clarification = clarification;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(int repairPrice) {
        this.repairPrice = repairPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
