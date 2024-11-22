package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CountryId;
    @Column(nullable = false)
    private String CountryName;
    @OneToMany(mappedBy = "CountryObj", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<State> StatesList;
}
