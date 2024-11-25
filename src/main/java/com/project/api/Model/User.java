package com.project.api.Model;
import jakarta.persistence.*;
import java.sql.Time;
import java.util.List;
@Entity
@Table(name = "TblUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false, unique = true)
    private String userNameApp;
    @Column(nullable = false)
    private Time dateOnCreated;
    @Column(nullable = false)
    private Boolean activeUser;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserNameApp() {
        return userNameApp;
    }

    public void setUserNameApp(String userNameApp) {
        this.userNameApp = userNameApp;
    }

    public Time getDateOnCreated() {
        return dateOnCreated;
    }

    public void setDateOnCreated(Time dateOnCreated) {
        this.dateOnCreated = dateOnCreated;
    }

    public Boolean getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(Boolean activeUser) {
        this.activeUser = activeUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}


