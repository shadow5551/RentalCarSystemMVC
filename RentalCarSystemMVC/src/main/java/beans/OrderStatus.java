package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
