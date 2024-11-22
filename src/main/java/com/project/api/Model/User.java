package com.project.api.Model;
import jakarta.persistence.*;
import java.sql.Time;
import java.util.List;
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String FirstName;

    @Column(nullable = false)
    private String LastName;

    @Column(nullable = false, unique = true)
    private String Email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, unique = true)
    private String UserNameApp;

    @Column(nullable = false)
    private Time DateOnCreated;

    @Column(nullable = false)
    private Boolean ActiveUser;
    //Relations
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RoleId", nullable = false)
    private Role RoleObj;

    @OneToMany(mappedBy = "UserObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> OrderList;

    @OneToMany(mappedBy = "UserObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> AddressList;

    //GetterAndSetters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
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
        return UserNameApp;
    }

    public void setUserNameApp(String userNameApp) {
        UserNameApp = userNameApp;
    }

    public Time getDateOnCreated() {
        return DateOnCreated;
    }

    public void setDateOnCreated(Time dateOnCreated) {
        DateOnCreated = dateOnCreated;
    }

    public Boolean getActiveUser() {
        return ActiveUser;
    }

    public void setActiveUser(Boolean activeUser) {
        ActiveUser = activeUser;
    }
}

