package com.project.api.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "TblStatus")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long statusId;

    @Column(nullable = false)
    private String statusName;

    @OneToMany(mappedBy = "status", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}


