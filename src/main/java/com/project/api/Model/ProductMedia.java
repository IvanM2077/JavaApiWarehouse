package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table(name = "TblProductMedia")
public class ProductMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productMediaId;

    @Column(nullable = false)
    private String urlFile;

    @Column(nullable = false)
    private String mediaType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false) // Clave foránea hacia Product
    private Product product;
}


