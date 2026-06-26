package com.jcking97.dinocardgamebackend;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DinoEqualityMessage {
    
    private boolean equal;

    @JsonCreator
    public DinoEqualityMessage(@JsonProperty("equal") boolean equal) {
        this.equal = equal;
    }

}
