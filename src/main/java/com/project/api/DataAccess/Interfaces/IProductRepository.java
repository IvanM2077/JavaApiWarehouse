package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
