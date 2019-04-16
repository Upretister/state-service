package com.employee.stateservice.service;

import com.employee.stateservice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface StateService {
    ResponseEntity<State> saveState(State state);
}
