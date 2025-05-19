package com.critterm.lifescore.services;

import com.critterm.lifescore.address.Address;
import com.critterm.lifescore.tastes.Tastes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private MapsService mapsService;

    @Autowired
    private CrimeService crimeService;

    public int getScore(Address address, Tastes tastes) {

        int walkScore = mapsService.walkScore(address.getAddress());
        int crimeScore = crimeService.getCrimeScore(address);
        double groceryDistance = mapsService.distanceToGrocery(address.getAddress());
        int diningScore = mapsService.diningScore(address.getAddress());
        double gymDistance = mapsService.distanceToGym(address.getAddress());
        int nightlifeScore = mapsService.nightlifeScore(address.getAddress());
        int schoolScore= mapsService.schoolScore(address.getAddress());
        double workDistance = mapsService.distanceToWork(address.getAddress(), address.getWorkAddress());

       return ScoreCalculator.calculateScore(tastes, walkScore, crimeScore,groceryDistance,diningScore,gymDistance,nightlifeScore,schoolScore,workDistance );
    }

}
