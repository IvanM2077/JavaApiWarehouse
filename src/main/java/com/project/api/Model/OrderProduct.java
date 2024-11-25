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
}


