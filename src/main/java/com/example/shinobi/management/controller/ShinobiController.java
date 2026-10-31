
package com.example.shinobi.management.controller;

import com.example.shinobi.management.model.Shinobi;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shinobis")
public class ShinobiController {

    @GetMapping
    public List<Shinobi> getShinobis() {

        List<Shinobi> ninjas = new ArrayList<>();

        ninjas.add(new Shinobi(
                1, "Naruto", "naruto@example.com", "Hokage"
        ));

        ninjas.add(new Shinobi(
                2, "Sasuke", "sasuke@example.com", "Security"
        ));

        ninjas.add(new Shinobi(
                3, "Sakura", "sakura@example.com", "Medical"
        ));

        return ninjas;
    }
}