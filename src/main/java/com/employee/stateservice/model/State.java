package com.employee.stateservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Getter
@Setter
public class State {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="state_id")
    private Long stateId;

    @Column(name="state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "country_id",nullable = false)
    private Country country;

  /*  @JsonCreator
    public State(){

    }*/
/*
    private Long countryId;
*/

   /* public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }*/


}
