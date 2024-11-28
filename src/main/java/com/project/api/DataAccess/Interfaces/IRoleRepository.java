package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
