package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Long> {
}
