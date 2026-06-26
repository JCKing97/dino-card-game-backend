package com.jcking97.dinocardgamebackend;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DinoCollectionMessage {
    
    private Dino[] dinos;

    @JsonCreator
    public DinoCollectionMessage(@JsonProperty("dinos") Dino[] dinos) {
        this.dinos = dinos;
    }

}
