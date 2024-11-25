package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table(name = "TblWarehouseInventory")
public class WarehouseInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long warehouseInventoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouseId", nullable = false) // Clave foránea hacia Warehouse
    private Warehouse warehouse;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false) // Clave foránea hacia Product
    private Product product;
    @Column(nullable = false)
    private int warehouseAmount;
}

