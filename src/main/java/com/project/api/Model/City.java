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

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
