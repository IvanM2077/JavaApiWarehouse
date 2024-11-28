package com.project.api.DataAccess;

import com.project.api.Model.ProductMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMediaRepository extends JpaRepository<ProductMedia, Long> {
}
