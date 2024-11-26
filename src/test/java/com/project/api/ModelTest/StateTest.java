package com.project.api.ModelTest;

import com.project.api.Model.City;
import com.project.api.Model.Country;
import com.project.api.Model.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StateTest {

    private State state;

    @BeforeEach
    public void  init(){
        this.state = new State();
    }

    @Test
    public void testGetterAndSetterStateId(){
        //Arrange
        Long exepectedStateId = 1L;
        //Act
        state.setStateId(exepectedStateId);
        //Assert
        assertEquals(exepectedStateId, state.getStateId());

    }
    @Test
    public void testGetterAndSetterStateName(){
        //Arrange
        String expectedStateName = "Yucatan";
        //Act
        state.setStateName(expectedStateName);
        //Assert
        assertEquals(expectedStateName, state.getStateName());

    }
    @Test
    public void testGetterAndSetterCountry(){
        //Arrange
        Country expectedCountry = new Country();
        expectedCountry.setCountryId(1L);
        //Act
        state.setCountry(expectedCountry);
        //Assert
        assertEquals(expectedCountry, state.getCountry());
    }
    @Test
    public void testGetterAndSetterCities(){
        //Arrange
        List<City> expectedCities = new ArrayList<>();
        int counter=0;
        for(int i=1; i<5; i++){
            counter = i;
            var city = new City();
            city.setCityId(i);
            expectedCities.add(city);
        }
        //Act
        state.setCities(expectedCities);
        //Assert
        assertEquals(expectedCities, state.getCities());
        assertEquals(counter, (int)state.getCities().size());

    }
}
