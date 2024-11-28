package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.WarehouseInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWarehouseInventoryRepository extends JpaRepository<WarehouseInventory, Long> {
}
