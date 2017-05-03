package beans;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User extends BeanId {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private int balance;

    @Column(name = "numberPassport")
    private String numberOfPassport;

    @ManyToMany
    @JoinTable(name="UserRole",
            joinColumns = @JoinColumn(name="Users_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="Roles_id", referencedColumnName="id")
    )
    private Set<Role> roles;



    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Order> orders;

    public User(String login, String password, String numberOfPassport, int balance) {
        this.login = login;
        this.password = password;
        this.numberOfPassport = numberOfPassport;
        this.balance = balance;

    }

    public User(Integer id, String login, String password, int balance, String numberOfPassport, Set<Role> roles, Set<Order> orders) {
        super(id);
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.numberOfPassport = numberOfPassport;
        this.roles = roles;
        this.orders = orders;
    }

    public User(){}

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumberOfPassport() {
        return numberOfPassport;
    }

    public void setNumberOfPassport(String numberOfPassport) {
        this.numberOfPassport = numberOfPassport;
    }


}
