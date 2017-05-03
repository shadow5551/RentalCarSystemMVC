package beans;

import javax.persistence.*;

@Entity
@Table(name = "Statuses")
public enum  OrderStatus {
    PROCESS,
    ACCEPTED,
    REJECTED,
    REPAIRED,
    RENTED,
    CLOSED,;

    @Id
    @Column(name = "id",insertable = false, updatable = false , nullable = false)
    private int id;

    @OneToOne(optional = false, mappedBy="orderStatus")
    public Order order;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
