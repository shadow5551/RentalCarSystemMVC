package beans;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class BeanId implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",insertable = false, updatable = false , nullable = false)
    protected Integer id;

    public BeanId() {
    }

    public BeanId(Integer id) {
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}