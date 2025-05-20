package com.critterm.lifescore.results;

import com.critterm.lifescore.results.Results;
import com.critterm.lifescore.results.ScoreService;
import com.critterm.lifescore.services.MapsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/results")
public class ResultsController {
    private final ScoreService resultsService;

    public ResultsController(ScoreService resultsService){
        this.resultsService = resultsService;
    }

    @GetMapping
    public ResponseEntity<Results> getResults(){
        Results results = resultsService.getResults();
        return ResponseEntity.ok(results);
    }


}