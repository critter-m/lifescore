package com.critterm.lifescore.tastes;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tastes {

    @Id
    private Long id = 1L;
    private int crime;
    private int library;
    private int walkability;
    private int grocery;
    private int dining;
    private int gym;
    private int nightlife;
    private int school;
    private int work;

    public Tastes() {
        this.crime = 0;
        this.library = 0;
        this.walkability = 0;
        this.grocery = 0;
        this.dining = 0;
        this.gym = 0;
        this.nightlife = 0;
        this.school = 0;
        this.work = 0;
    }

    public Tastes(int crime, int library, int walkability, int grocery, int dining, int gym, int nightlife, int school, int work) {
        this.crime = crime;
        this.library = library;
        this.walkability = walkability;
        this.grocery = grocery;
        this.dining = dining;
        this.gym = gym;
        this.nightlife = nightlife;
        this.school = school;
        this.work = work;
    }

    public int getCrime() {
        return crime;
    }

    public int getLibrary() {
        return library;
    }

    public int getWalkability() {
        return walkability;
    }

    public int getGrocery() {
        return grocery;
    }

    public int getDining() {
        return dining;
    }

    public int getGym() {
        return gym;
    }

    public int getNightlife() {
        return nightlife;
    }

    public int getSchool() {
        return school;
    }

    public int getWork() {
        return work;
    }

    public void setCrime(int crime) {
        this.crime = crime;
    }

    public void setLibrary(int library) {
        this.library = library;
    }

    public void setWalkability(int walkability) {
        this.walkability = walkability;
    }

    public void setGrocery(int grocery) {
        this.grocery = grocery;
    }

    public void setDining(int dining) {
        this.dining = dining;
    }

    public void setGym(int gym) {
        this.gym = gym;
    }

    public void setNightlife(int nightlife) {
        this.nightlife = nightlife;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public void setId(Long id){
        this.id = id;
    }
}
