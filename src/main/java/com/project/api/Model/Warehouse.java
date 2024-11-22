package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long WarehouseId;

    @Column(nullable = false)
    private String WarehouseName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CityId", nullable = false) // Clave foránea hacia City
    private City city;

    @OneToMany(mappedBy = "WarehouseObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WarehouseInventory> WarehouseInventoryList;
}

