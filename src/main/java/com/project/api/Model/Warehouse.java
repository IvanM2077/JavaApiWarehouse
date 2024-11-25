package com.project.api.Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "TblWarehouse")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long warehouseId;
    @Column(nullable = false)
    private String warehouseName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", nullable = false) // Clave foránea hacia City
    private City city;
    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WarehouseInventory> warehouseInventoryList;
}


