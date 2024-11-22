package com.project.api.Model;
import jakarta.persistence.*;
@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RoleId;
    @Column(nullable = false, unique = true)
    private String RoleName;
}

