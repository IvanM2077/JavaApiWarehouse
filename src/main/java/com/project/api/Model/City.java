package com.project.api.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TblCity")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;
    @Column(nullable = false)
    private String cityName;
    @Column(nullable = false)
    private String codePostal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stateId", nullable = false) // Clave foránea hacia State
    private State state;
    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Warehouse warehouse;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses;
}
