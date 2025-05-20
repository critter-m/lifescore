package com.critterm.lifescore.services;

import com.critterm.lifescore.address.Address;
import org.springframework.stereotype.Service;

@Service
public class MapsService {

    public static String detectCoords(String address){

        String coords;

        coords = "67.5";

        return coords;
    }

    public static String detectNeighborhood(String address){
        String coords = detectCoords(address);
        String hood = coords + " st.";

        hood = "foxhall";


        return hood;
    }


    public boolean checkAddress(String street, String city, String state, String zip){

        return false;
    }

    public double distanceToLibrary(String address){

        return 5.5;
    }

    public double distanceToGym(String address){

        return 5.5;
    }
    public double distanceToWork(String address, String workAddress){

        return 5.5;
    }

    public double distanceToGrocery(String address){

        return 5.5;
    }

    public int nightlifeScore(String address){

        return 5;
    }

    public int diningScore(String address){

        return 5;
    }
    public int walkScore(String address){

        return 5;
    }

    public int crimeScore(String address){

        return 5;
    }

    public int schoolScore(String address){

        return 5;
    }


}
