package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table(name = "TblOrderProduct")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderProductId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", nullable = false) // Clave foránea hacia Order
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false) // Clave foránea hacia Product
    private Product product;

    public long getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(long orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}


