package com.jcking97.dinocardgamebackend;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Dino implements Serializable {
    
    @EqualsAndHashCode.Include
    private String name;
    private String description;
    private String image;

    @JsonCreator
    public Dino(
        @JsonProperty("name") String name,
        @JsonProperty("description") String description,
        @JsonProperty("image") String image
    ) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

}
