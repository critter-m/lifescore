package com.critterm.lifescore.results;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Results {
    @Id
    Long id = 1L;

    Integer score;

    Integer walkScore;
    Integer diningScore;
    double groceryDistance;
    Integer crimeScore;
    double gymDistance;
    Integer nightlifeScore;
    Integer schoolScore;
    double workDistance;

    public Results() {
    }

    public Results(Integer score, Integer walkScore, Integer crimeScore, double groceryDistance, Integer diningScore, double gymDistance, Integer nightlifeScore, Integer schoolScore, double workDistance) {
        this.score = score;
        this.walkScore = walkScore;
        this.diningScore = diningScore;
        this.groceryDistance = groceryDistance;
        this.crimeScore = crimeScore;
        this.gymDistance = gymDistance;
        this.nightlifeScore = nightlifeScore;
        this.schoolScore = schoolScore;
        this.workDistance = workDistance;
    }

    public Long getId() {
        return id;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getWalkScore() {
        return walkScore;
    }

    public Integer getDiningScore() {
        return diningScore;
    }

    public double getGroceryDistance() {
        return groceryDistance;
    }

    public Integer getCrimeScore() {
        return crimeScore;
    }

    public double getGymDistance() {
        return gymDistance;
    }

    public Integer getNightlifeScore() {
        return nightlifeScore;
    }

    public Integer getSchoolScore() {
        return schoolScore;
    }

    public double getWorkDistance() {
        return workDistance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setWalkScore(Integer walkScore) {
        this.walkScore = walkScore;
    }

    public void setDiningScore(Integer diningScore) {
        this.diningScore = diningScore;
    }

    public void setGroceryDistance(double groceryDistance) {
        this.groceryDistance = groceryDistance;
    }

    public void setCrimeScore(Integer crimeScore) {
        this.crimeScore = crimeScore;
    }

    public void setGymDistance(double gymDistance) {
        this.gymDistance = gymDistance;
    }

    public void setNightlifeScore(Integer nightlifeScore) {
        this.nightlifeScore = nightlifeScore;
    }

    public void setSchoolScore(Integer schoolScore) {
        this.schoolScore = schoolScore;
    }

    public void setWorkDistance(double workDistance) {
        this.workDistance = workDistance;
    }
}
