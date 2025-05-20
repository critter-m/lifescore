package com.critterm.lifescore.address;

import com.critterm.lifescore.results.ScoreService;
import com.critterm.lifescore.tastes.TastesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private TastesService tastesService;

    public AddressService(AddressRepository addressRepository, TastesService tastesService) {
        this.addressRepository = addressRepository;
        this.tastesService = tastesService;
    }

    public Address getAddress(){

        Address address = addressRepository.findById(1L).orElseGet(() -> createDefaultAddress());
        return address;
    }

    public Address addAddress(Address address){
        addressRepository.save(address);

        return address;
    }

    public Address updateAddress(Address updatedAddress){
        updatedAddress.setId(1L);
        return addressRepository.save(updatedAddress);
    }

    private Address createDefaultAddress(){
        Address address = new Address();
        address.setId(1L);
        return addressRepository.save(address);
    }


}

