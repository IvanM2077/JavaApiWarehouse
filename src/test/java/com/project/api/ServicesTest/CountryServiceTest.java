package com.project.api.ServicesTest;


import com.project.api.DataAccess.Interfaces.ICountryRepository;
import com.project.api.Services.Implements.CountryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CountryServiceTest {
    //Forma 3  de usar Mocks
    @Mock
    private ICountryRepository iCountryRepository;
    @InjectMocks
    private CountryService countryService;
    @Test
    public void testFindAll(){

    }
}
