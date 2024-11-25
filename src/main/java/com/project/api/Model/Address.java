package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table(name = "TblAddress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;

    @Column(nullable = false)
    private String addressName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", nullable = false) // Clave foránea hacia City
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserId", nullable = false) // Clave foránea hacia User
    private User user;
}
