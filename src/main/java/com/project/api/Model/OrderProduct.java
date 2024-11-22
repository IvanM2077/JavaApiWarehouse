package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long OrderProductId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderId", nullable = false) // Clave foránea hacia Order
    private Order OrderObj;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId", nullable = false) // Clave foránea hacia Product
    private Product ProductObj;
}

