package com.jcking97.dinocardgamebackend;

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

    @GetMapping("/dinoEquality")
    public DinoEqualityMessage getDinosEquality(@RequestBody DinoCollectionMessage dinos) {
        Set<Dino> dinoSet = Set.of(dinos.getDinos());
        return new DinoEqualityMessage(dinoSet.size() == 1);
    }

}
