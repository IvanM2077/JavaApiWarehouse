package com.project.api.ModelTest;
import com.project.api.Model.Address;
import com.project.api.Model.City;
import com.project.api.Model.User;
import jakarta.persistence.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddressTest {

    private Address address;

    @BeforeEach
    public void init(){
        this.address = new Address();
    }

     @Test
    public void testGetterAndSetterAddressId(){
         //arrange
         //Address address = new Address(); en vez de escribir en todos los test la instancia lo escribimos una vez en el void init y
         //cada vez que se vaya a utilizar se inicializa la instancia en cada uno de los test sin tener que escribirlo un buen de veces
         long expectedAddressId = 1L;
         //act
         address.setAddressId(expectedAddressId);
         //assert
         Assertions.assertEquals(expectedAddressId, address.getAddressId());

     }
    @Test
    public void testGetterAndSetterAddressName(){
        //arrange
        String expectedAddressName = "Calle prueba";
        //act
        address.setAddressName(expectedAddressName);
        //assert
        Assertions.assertEquals(expectedAddressName, address.getAddressName());
    }
    @Test
    public void testGetterAndSetterCity(){
        //arrange
        City expectedCity = new City();
        expectedCity.setCityId(1L);
        //act
        address.setCity(expectedCity);
        //assert
        Assertions.assertEquals(expectedCity, address.getCity());

    }
    @Test
    public void testGetterAndSetterUser(){
        //arrange
        User expectedUser = new User();
        expectedUser.setUserId(1L);
        //act
        address.setUser(expectedUser);
        //assert
        Assertions.assertEquals(expectedUser, address.getUser());
    }

}
