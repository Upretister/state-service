package com.employee.stateservice.service;

import com.employee.stateservice.model.State;
import com.employee.stateservice.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service("stateService")
public class StateServiceImpl implements StateService {

    @Autowired
    StateRepository stateRepository;

    @Override
    public ResponseEntity<State> saveState(State state) {


        return new ResponseEntity<State>(stateRepository.save(state),HttpStatus.OK);
    }
}
