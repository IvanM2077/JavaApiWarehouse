package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWarehouseRepository extends JpaRepository<Warehouse, Long> {
}
