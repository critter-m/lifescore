package com.critterm.lifescore.address;

import com.critterm.lifescore.services.ScoreService;
import com.critterm.lifescore.tastes.Tastes;
import com.critterm.lifescore.tastes.TastesRepository;
import com.critterm.lifescore.tastes.TastesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private TastesService tastesService;

    public AddressService(AddressRepository addressRepository, ScoreService scoreService, TastesService tastesService) {
        this.addressRepository = addressRepository;
        this.scoreService = scoreService;
        this.tastesService = tastesService;
    }

    public Address getAddress(){

        Address address = addressRepository.findById(1L).orElseGet(() -> createDefaultAddress());
        if (address.getLifescore() == null) {
            address.setLifescore(scoreService.getScore(address, tastesService.getTastes()));
            addressRepository.save(address);
        }
        return address;
    }

    public Address addAddress(Address address){
        address.setLifescore(scoreService.getScore(address, tastesService.getTastes()));
        addressRepository.save(address);

        return address;
    }

    public Address updateAddress(Address updatedAddress){
        updatedAddress.setId(1L);
        updatedAddress.setLifescore(scoreService.getScore(updatedAddress, tastesService.getTastes()));
        return addressRepository.save(updatedAddress);
    }

    private Address createDefaultAddress(){
        Address address = new Address();
        address.setId(1L);
        return addressRepository.save(address);
    }


}

