package com.jcking97.dinocardgamebackend;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class DinoController {

    private final DinoRetriever dinoRetriever;

    @Autowired
    public DinoController(DinoRetriever dinoRetriever) {
        this.dinoRetriever = dinoRetriever;
    }

    @GetMapping("/dinos")
    public ResponseEntity<DinoCollectionMessage> getDinos(@RequestParam int dinoCount) {
        Dino[] dinos = new Dino[dinoCount];
        for (int i = 0; i < dinoCount; i++) {
            dinos[i] = dinoRetriever.getRandomDino();
        }
        return ResponseEntity.ok(new DinoCollectionMessage(dinos));
    }

    @GetMapping("/dinos/allEqual")
    public ResponseEntity<DinoEqualityMessage> getDinosEquality(@RequestParam List<String> dinoNames) {
        boolean allExist = dinoNames.stream().allMatch(name -> dinoRetriever.exists(name));
        if (!allExist) {
            throw new IllegalArgumentException("One or more dino names do not exist in the collection.");
        }
        long distinctDinos = new HashSet<>(dinoNames).size();
        return ResponseEntity.ok(new DinoEqualityMessage(1 == distinctDinos));
    }

}
