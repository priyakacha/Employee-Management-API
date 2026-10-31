
package com.example.shinobi.management.controller;

import com.example.shinobi.management.model.Shinobi;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shinobis")
public class ShinobiController {

    private List<Shinobi> ninjas = new ArrayList<>();

    @GetMapping
    public List<Shinobi> getShinobi(){
        return ninjas;
    }

    @PostMapping
    public Shinobi addShinobi(@RequestBody Shinobi shinobi){
        ninjas.add(shinobi);
        return shinobi;
    }

    @PutMapping("/{id}")
    public Shinobi updateShinobi(
            @PathVariable int id,
            @RequestBody Shinobi updatedShinobi) {

        for (int i = 0; i < ninjas.size(); i++) {

            if (ninjas.get(i).getId() == id) {
                ninjas.set(i, updatedShinobi);
                return updatedShinobi;
            }
        }

        return null;
    }
    public ShinobiController() {
        ninjas.add(new Shinobi(1, "Naruto", "naruto@example.com", "Hokage"));
        ninjas.add(new Shinobi(2, "Sasuke", "sasuke@example.com", "Security"));
        ninjas.add(new Shinobi(3, "Sakura", "sakura@example.com", "Medical"));
    }

    @GetMapping("/{id}")
    public Shinobi getShinobisById(@PathVariable int id) {

        for (Shinobi ninja : ninjas) {
            if (ninja.getId() == id) {
                return ninja;
            }
        }


        return null;
    }
}