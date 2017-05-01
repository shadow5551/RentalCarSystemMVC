package beans;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User {

    @Id
    private int id;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id", nullable = false)
    private Order order;

    public User(String login, String password, String numberOfPassport, int balance) {
        this.login = login;
        this.password = password;
        this.numberOfPassport = numberOfPassport;
        this.balance = balance;

    }



    public User() {
    }

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



    @Override
    public String toString() {
        return String
                .format("id : %5s login: %5s password: %5s numberPassport: %5s",login, password, numberOfPassport);
    }

}
