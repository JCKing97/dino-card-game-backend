package com.jcking97.dinocardgamebackend;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DinoController {

    private final DinoRetriever dinoRetriever;

    @Autowired
    public DinoController(DinoRetriever dinoRetriever) {
        this.dinoRetriever = dinoRetriever;
    }

    @GetMapping("/dinos")
    public DinoCollectionMessage getDinos(@RequestParam int dinoCount) {
        Dino[] dinos = new Dino[dinoCount];
        for (int i = 0; i < dinoCount; i++) {
            dinos[i] = dinoRetriever.getRandomDino();
        }
        return new DinoCollectionMessage(dinos);
    }

    @GetMapping("/dinos/allEqual")
    public DinoEqualityMessage getDinosEquality(@RequestBody DinoCollectionMessage dinos) {
        long allDinos = dinos.getDinos().length;
        long distinctDinos = Arrays.stream(dinos.getDinos()).distinct().count();
        return new DinoEqualityMessage(allDinos == distinctDinos);
    }

}
