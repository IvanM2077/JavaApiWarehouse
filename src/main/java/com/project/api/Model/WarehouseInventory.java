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

    public long getWarehouseInventoryId() {
        return warehouseInventoryId;
    }

    public void setWarehouseInventoryId(long warehouseInventoryId) {
        this.warehouseInventoryId = warehouseInventoryId;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getWarehouseAmount() {
        return warehouseAmount;
    }

    public void setWarehouseAmount(int warehouseAmount) {
        this.warehouseAmount = warehouseAmount;
    }
}

