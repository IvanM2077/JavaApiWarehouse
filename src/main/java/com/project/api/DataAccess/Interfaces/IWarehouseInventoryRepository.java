package com.project.api.DataAccess;

import com.project.api.Model.WarehouseInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseInventoryRepository extends JpaRepository<WarehouseInventory, Long> {
}
