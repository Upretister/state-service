package com.employee.stateservice.controller;

import com.employee.stateservice.model.State;
import com.employee.stateservice.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class StateController {

    @Autowired
    StateService stateService;

    @RequestMapping(value = "state", method = RequestMethod.POST)
    public ResponseEntity<State> saveState(@RequestBody State state){
        System.out.println("Controller Save:: "+state.getState());
        return stateService.saveState(state);
    }
}
