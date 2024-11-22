package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long OrderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId", nullable = false) // Clave foránea hacia User
    private User UserObj;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StatusId", nullable = false) // Clave foránea hacia Status
    private Status StatusId;

    @OneToMany(mappedBy = "OrderObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderProduct> OrderProductList;
}

