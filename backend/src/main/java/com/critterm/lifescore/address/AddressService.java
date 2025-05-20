package com.critterm.lifescore.address;

import com.critterm.lifescore.tastes.Tastes;
import com.critterm.lifescore.tastes.TastesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address getAddress(){
        return addressRepository.findById(1L).orElseGet(() -> createDefaultAddress());
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

