package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProductId;

    @Column(nullable = false)
    private String Item;

    @Column(nullable = false)
    private String Description;

    @Column(nullable = false)
    private Double Price;

    @OneToOne(mappedBy = "Product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ProductMedia productMedia;
}

