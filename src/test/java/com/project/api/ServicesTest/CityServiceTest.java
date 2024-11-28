package com.project.api.ServicesTest;

import com.project.api.DataAccess.Interfaces.ICityRepository;
import com.project.api.Services.Implements.CityService;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
public class CityServiceTest {
    //Forma 2 de usar Mocks
    private ICityRepository iCityRepository;
    private CityService cityService;

    @BeforeEach
    public void init(){
        this.iCityRepository = mock(ICityRepository.class);
        this.cityService = new CityService(iCityRepository);
    }


}
