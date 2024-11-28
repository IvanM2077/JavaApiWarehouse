package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.ProductMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductMediaRepository extends JpaRepository<ProductMedia, Long> {
}
