package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Long> {
}
