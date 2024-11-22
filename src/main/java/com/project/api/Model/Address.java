package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long AddressId;

    @Column(nullable = false)
    private String AddressName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CityId", nullable = false) // Clave foránea hacia City
    private City CityObj;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId", nullable = false) // Clave foránea hacia User
    private User UserObj;
}

