package com.project.api.ServicesTest;

import com.project.api.DataAccess.Interfaces.ICityRepository;
import com.project.api.DbTest.DataProvider;
import com.project.api.Services.Implements.CityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class CityServiceTest {
    //Forma 2 de usar Mocks
    private ICityRepository iCityRepository;
    private CityService cityService;

    @BeforeEach
    public void init(){
        this.iCityRepository = mock(ICityRepository.class);
        this.cityService = new CityService(iCityRepository);
    }
    @Test
    public void testGetAll(){
        //arrange
        var cityListExpected = DataProvider.allCities();

        //act
        when(this.iCityRepository.findAll()).thenReturn(DataProvider.allCities());
        var cityListResult = cityService.GetAll();
        //assert
        assertNotNull(cityListResult);
        assertEquals(cityListExpected.size(), cityListResult.size());
        assertSame(cityListExpected, cityListResult);
    }
    @Test
    public void testGetWithId(){
        //arrange
        var expectedCity = DataProvider.getByIdCity();
        var expectedId = 1L;
        when(iCityRepository.findById(anyLong())).thenReturn(Optional.of(DataProvider.getByIdCity()));
        //act
        var result = cityService.GetWithId(expectedId);
        //assert
        assertNotNull(result);
        assertEquals(expectedCity.getCityId(), result.getCityId());

    }
    @Test
    public void testCreate(){

    }    @Test
    public void testCreateThrowException(){

    }
    @Test
    public void testUpdate(){

    }
    @Test
    public void testUpdateThrowException(){

    }
    @Test
    public void testDelete(){

    }
    @Test
    public void testDeleteThrowException(){

    }
    @Test
    public void testBulkCreate(){

    }
    @Test
    public void testBulkCreateThrowException(){

    }
    @Test
    public void testBulkUpdate(){

    }
    @Test
    public void testBulkUpdateThrowException(){

    }
    @Test
    public void testBulkDelete(){

    }
    @Test
    public void testBulkDeleteThrowException(){

    }


}
