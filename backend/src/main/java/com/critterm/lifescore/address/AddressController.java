package com.critterm.lifescore.address;

import com.critterm.lifescore.services.MapsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/address")
public class AddressController {
    private final AddressService addressService;
    private MapsService mapsService;

    public AddressController(AddressService addressService, MapsService mapsService){
        this.addressService = addressService;
        this.mapsService = mapsService;
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

    @GetMapping("/score")
    public ResponseEntity<Integer> getScore() {
        Address address = addressService.getAddress();
        int score = address.getLifescore();
        return ResponseEntity.ok(score);
    }

    @GetMapping("/exists")
    public ResponseEntity<Boolean> checkAddressExists(@RequestParam String street, @RequestParam String city, @RequestParam String state, @RequestParam String zip) {
        boolean exists = mapsService.checkAddress(street, city, state, zip);
        return ResponseEntity.ok(exists);
    }



}