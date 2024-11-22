package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CityId;

    @Column(nullable = false)
    private String CityName;

    @Column(nullable = false)
    private String CodePostal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StateId", nullable = false) // Clave foránea hacia State
    private State StateObj;

    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Warehouse WarehouseObj;

    @OneToMany(mappedBy = "CityObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> AddressList;
}
