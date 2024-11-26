package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "TblProduct")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @Column(nullable = false)
    private String item;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Double price;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProductMedia productMedia;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<WarehouseInventory> warehouseInventoryProducts;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderProduct> orderProducts;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductMedia getProductMedia() {
        return productMedia;
    }

    public void setProductMedia(ProductMedia productMedia) {
        this.productMedia = productMedia;
    }

    public List<WarehouseInventory> getWarehouseInventoryProducts() {
        return warehouseInventoryProducts;
    }

    public void setWarehouseInventoryProducts(List<WarehouseInventory> warehouseInventoryProducts) {
        this.warehouseInventoryProducts = warehouseInventoryProducts;
    }

    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }
}


