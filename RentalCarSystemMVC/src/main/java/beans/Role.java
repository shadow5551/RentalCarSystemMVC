package beans;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles")
public enum Role {
    ADMIN,
    USER,
    ;
    @Id
    @Column(name = "id",insertable = false, updatable = false , nullable = false)
    private int id;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
    private Set<User> users;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
