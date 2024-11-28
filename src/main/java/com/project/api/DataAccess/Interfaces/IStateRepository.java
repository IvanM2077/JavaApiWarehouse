package com.project.api.DataAccess.Interfaces;

import com.project.api.Model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStateRepository extends JpaRepository<State, Long> {
}
