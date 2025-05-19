package com.critterm.lifescore.tastes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.font.TextAttribute;
import java.util.Optional;

@Component
public class TastesService {

    @Autowired
    private TastesRepository tastesRepository;

    public Tastes getTastes(){
        return tastesRepository.findById(1L).orElseGet(() -> createDefaultTastes());
    }
    public Tastes addTastes(Tastes tastes){

        tastesRepository.save(tastes);
        return tastes;
    }

    public Tastes updateTastes(Tastes updatedTastes){
        updatedTastes.setId(1L);
        return tastesRepository.save(updatedTastes);
    }

    private Tastes createDefaultTastes(){
        Tastes tastes = new Tastes();
        tastes.setId(1L);
        return tastesRepository.save(tastes);
    }

}
