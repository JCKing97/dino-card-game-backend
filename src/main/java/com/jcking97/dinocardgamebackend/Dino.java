package com.jcking97.dinocardgamebackend;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dino {
    
    @EqualsAndHashCode.Include
    private String name;
    private String description;
    private String image;

}
