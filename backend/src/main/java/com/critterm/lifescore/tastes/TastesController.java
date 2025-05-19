package com.critterm.lifescore.tastes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/tastes")
public class TastesController {
    private final TastesService tastesService;

    public TastesController(TastesService tastesService){
        this.tastesService = tastesService;
    }

    @GetMapping
    public ResponseEntity<Tastes> getTastes(){
        Tastes tastes = tastesService.getTastes();
        return ResponseEntity.ok(tastes);
    }

    @PutMapping
    public ResponseEntity<Tastes> updateTastes(@RequestBody Tastes updatedTastes){
        Tastes saved = tastesService.updateTastes(updatedTastes);
        return ResponseEntity.ok(saved);

    }



}
