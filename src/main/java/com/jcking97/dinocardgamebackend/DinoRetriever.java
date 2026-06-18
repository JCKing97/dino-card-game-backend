package com.jcking97.dinocardgamebackend;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DinoRetriever {
    
    private final List<Dino> dinosaurs = Arrays.asList(
            new Dino("Tyrannosaurus Rex", "Ferocious carnivore!", "https://live.staticflickr.com/65535/55342339193_7c643e2acd_c.jpg"),
            new Dino("Brachiosaurus", "Gentle giant", "https://live.staticflickr.com/65535/55342406499_200e2b116b_c.jpg"),
            new Dino("Velociraptor", "Pack hunter!", "https://live.staticflickr.com/65535/55342202106_4fb61d2f13_c.jpg"),
            new Dino("Triceratops", "A three-horned herbivore", "https://live.staticflickr.com/65535/55342339203_563531d3bf_c.jpg"),
            new Dino("Stegosaurus", "A spiny herbivore with a barbed tail", "https://live.staticflickr.com/65535/55342202066_1487f536cb_c.jpg"),
            new Dino("Pterodactyl", "A flying pterosaur!", "https://live.staticflickr.com/65535/55342348978_b997274ed7_c.jpg"),
            new Dino("Archaeopteryx", "The link between dinosaurs and birds", "https://live.staticflickr.com/65535/55342202096_766c99d5e4_z.jpg")
    );

    private final Random random = new Random();

    /**
     * Retrieves a random dinosaur name.
     * @return A random dinosaur name.
     */
    public Dino getRandomDino() {
        return dinosaurs.get(random.nextInt(dinosaurs.size()));
    }

}
