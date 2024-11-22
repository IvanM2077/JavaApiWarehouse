package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StateId;

    @Column(nullable = false)
    private String StateName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryId", nullable = false) // Clave foránea hacia Country
    private Country CountryObj;

    @OneToMany(mappedBy = "StateObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> CityList;
}

