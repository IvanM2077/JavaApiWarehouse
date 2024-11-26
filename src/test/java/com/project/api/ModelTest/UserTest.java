package com.project.api.ModelTest;

import com.project.api.Model.Address;
import com.project.api.Model.Order;
import com.project.api.Model.Role;
import com.project.api.Model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void init() throws InterruptedException {
        this.user = new User();
        Thread.sleep(100);
    }


    @Test
    public void testSetAndGetUserId() {
        long expectedId = 1L;
        user.setUserId(expectedId);
        Assertions.assertEquals(expectedId, user.getUserId());
    }
    @Test
    public void testSetAndGetFirstName() {

        String expectedName= "Jhon";
        user.setFirstName(expectedName);
        Assertions.assertEquals(expectedName, user.getFirstName());
    }
    @Test
    public void testSetAndGetLastName() {
        String expectedName= "Dhoe";
        user.setLastName(expectedName);
        Assertions.assertEquals(expectedName, user.getLastName());
    }
    @Test
    public void testSetAndGetEmail() {
        String expectedEmail= "123@gmail.com";
        user.setEmail(expectedEmail);
        Assertions.assertEquals(expectedEmail, user.getEmail());
    }
    @Test
    public void testSetAndGetPassword() {
        String expectedPassword= "1234";
        user.setPassword(expectedPassword);
        Assertions.assertEquals(expectedPassword, user.getPassword());
    }
    @Test
    public void testSetAndGetAge() {
        int Age= 20;
        user.setAge(Age);
        Assertions.assertEquals(Age, user.getAge());
    }
    @Test
    public void testSetAndGetUserNameApp() {
        String expectedUserNameApp= "NameApp";
        user.setUserNameApp(expectedUserNameApp);
        Assertions.assertEquals(expectedUserNameApp, user.getUserNameApp());
    }
    @Test
    public void testSetAndGetDateOnCreated() {
        Time expectedDate = new Time(System.currentTimeMillis());
        user.setDateOnCreated(expectedDate);
        Assertions.assertEquals(expectedDate, user.getDateOnCreated());
    }
    @Test
    public void testSetAndGetActiveUser() {
        Boolean expectedActiveUser=false;
        user.setActiveUser(expectedActiveUser);
        Assertions.assertEquals(expectedActiveUser, user.getActiveUser());
    }
    @Test
    public void testSetAndGetRole() {
        Role expectedRole= new Role();
        user.setRole(expectedRole);
        Assertions.assertEquals(expectedRole, user.getRole());
    }
    @Test
    public void testSetAndGetOrders() {
        long size =2;
        List<Order> orderList = List.of(
                new Order(),
                new Order()
        );
        user.setOrders(orderList);
        Assertions.assertEquals(orderList, user.getOrders());
        Assertions.assertEquals((long) user.getOrders().size(), size);
    }
    @Test
    public void testSetAndGetAddresses() {
        long size =2;
        List<Address> addressList = List.of(
                new Address(),
                new Address()
        );
        user.setAddresses(addressList);
        Assertions.assertEquals(addressList, user.getAddresses());
        Assertions.assertEquals((long) user.getAddresses().size(), size);
    }

}
