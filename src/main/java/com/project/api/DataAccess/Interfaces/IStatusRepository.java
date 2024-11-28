package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status, Long> {
}
