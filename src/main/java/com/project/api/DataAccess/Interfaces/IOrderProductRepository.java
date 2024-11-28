package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
