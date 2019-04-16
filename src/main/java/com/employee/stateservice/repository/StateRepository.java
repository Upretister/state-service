package com.employee.stateservice.repository;


import com.employee.stateservice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("stateRepository")
public interface StateRepository extends JpaRepository<State,Long> {
}
