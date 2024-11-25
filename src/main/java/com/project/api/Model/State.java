package com.project.api.Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "TblState")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stateId;
    @Column(nullable = false)
    private String stateName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countryId", nullable = false) // Clave foránea hacia Country
    private Country country;
    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
