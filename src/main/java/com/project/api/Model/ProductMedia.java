package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table
public class ProductMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProductMediaId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductId", nullable = false) // Clave foránea hacia Product
    private Product Product;

    @Column(nullable = false)
    private String urlFile;

    @Column(nullable = false)
    private String mediaType;
}

