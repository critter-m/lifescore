package com.critterm.lifescore.address;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<Address> getAddress(){
        Address address = addressService.getAddress();
        return ResponseEntity.ok(address);
    }

    @PutMapping
    public ResponseEntity<Address> updateAddress(@RequestBody Address updatedAddress){
        Address saved = addressService.updateAddress(updatedAddress);
        return ResponseEntity.ok(saved);

    }


}