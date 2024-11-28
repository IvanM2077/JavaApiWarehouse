package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
}
