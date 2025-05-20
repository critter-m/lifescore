package com.critterm.lifescore.results;

import com.critterm.lifescore.address.Address;
import com.critterm.lifescore.address.AddressService;
import com.critterm.lifescore.services.CrimeService;
import com.critterm.lifescore.services.MapsService;
import com.critterm.lifescore.tastes.Tastes;
import com.critterm.lifescore.tastes.TastesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    private MapsService mapsService;

    @Autowired
    private CrimeService crimeService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private TastesService tastesService;
    @Autowired
    private ResultsRepository resultsRepository;

    public ScoreService(MapsService mapsService, CrimeService crimeService, AddressService addressService, TastesService tastesService, ResultsRepository resultsRepository) {
        this.mapsService = mapsService;
        this.crimeService = crimeService;
        this.addressService = addressService;
        this.tastesService = tastesService;
        this.resultsRepository = resultsRepository;
    }

    public Results getResults(){
        calculateResults();
        return resultsRepository.findById(1L).orElseGet(() -> createDefaultResults());
    }

    private Results createDefaultResults(){
        Results results = new Results();
        results.setId(1L);
        return resultsRepository.save(results);
    }

    public void calculateResults() {
        Address address = addressService.getAddress();
        Tastes tastes = tastesService.getTastes();

        int walkScore = mapsService.walkScore(address.getAddress());
        int crimeScore = crimeService.getCrimeScore(address);
        double groceryDistance = mapsService.distanceToGrocery(address.getAddress());
        int diningScore = mapsService.diningScore(address.getAddress());
        double gymDistance = mapsService.distanceToGym(address.getAddress());
        int nightlifeScore = mapsService.nightlifeScore(address.getAddress());
        int schoolScore= mapsService.schoolScore(address.getAddress());
        double workDistance = mapsService.distanceToWork(address.getAddress(), address.getWorkAddress());

       Integer lifeScore = ScoreCalculator.calculateScore(
               tastes,
               walkScore,
               crimeScore,
               groceryDistance,
               diningScore,
               gymDistance,
               nightlifeScore,
               schoolScore,
               workDistance
       );

        Results results = new Results(lifeScore, walkScore, crimeScore, groceryDistance, diningScore, gymDistance, nightlifeScore, schoolScore, workDistance);
        results.setId(1L);
        resultsRepository.save(results);

    }

}
