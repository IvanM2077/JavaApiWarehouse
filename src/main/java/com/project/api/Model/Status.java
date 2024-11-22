package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StatusId;

    @Column(nullable = false)
    private String StatusName;

    @OneToMany(mappedBy = "StatusId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> OrderList;
}

