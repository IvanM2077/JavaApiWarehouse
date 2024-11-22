package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class WarehouseInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long WarehouseInventoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WarehouseId", nullable = false) // Clave foránea hacia Warehouse
    private Warehouse WarehouseObj;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId", nullable = false) // Clave foránea hacia Product
    private Product ProductObj;

    @Column(nullable = false)
    private int WarehouseAmount;
}

