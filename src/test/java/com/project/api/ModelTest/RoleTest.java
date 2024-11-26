package com.project.api.ModelTest;

import com.project.api.Model.Role;
import com.project.api.Model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static  org.junit.jupiter.api.Assertions.*;

public class RoleTest {
    private Role role;

    @BeforeEach
    public void init(){
        this.role = new Role();
    }


    @Test
    public void testGetterAndSetterRoleId(){
        //Arrange
        Long expectedRoleId = 1L;
        //Act
        role.setRoleId(expectedRoleId);
        //Assert
        assertEquals(expectedRoleId, role.getRoleId());
    }
    @Test
    public void testGetterAndSetterRoleName(){
        //Arrange
        String expectedRoleName = "Admin";
        //Act
        role.setRoleName(expectedRoleName);
        //Assert
        assertEquals(expectedRoleName, role.getRoleName());
    }
    @Test
    public void testGetterAndSetterRoleUsersList(){
        //Arrange
        List<User> expectedRoleUserList = List.of(new User(), new User());
        int counter =0;
        for (var roleUser : expectedRoleUserList){roleUser.setUserId(counter++);}
        //Act
        role.setUsers(expectedRoleUserList);
        //Assert
        assertEquals(expectedRoleUserList, role.getUsers());
        assertEquals(counter, role.getUsers().size());

    }

}
