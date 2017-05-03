package beans;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table (name = "Orders")
public class Order extends BeanId {


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
    @JoinColumn(name="id", unique = true, nullable = false , insertable = false ,updatable = false)
    private OrderStatus orderStatus;

    @OneToOne(optional = false)
    @JoinColumn(name="id", unique = true, nullable = false , insertable = false,updatable = false)
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false , insertable = false,updatable = false)
    private User user;

    public Order(Integer id, Date startDate, Date endDate, String clarification, int price, int repairPrice, OrderStatus orderStatus, Car car, User user) {
        super(id);
        this.startDate = startDate;
        this.endDate = endDate;
        this.clarification = clarification;
        this.price = price;
        this.repairPrice = repairPrice;
        this.orderStatus = orderStatus;
        this.car = car;
        this.user = user;
    }

    public Order(){}

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
