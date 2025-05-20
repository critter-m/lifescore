package com.critterm.lifescore.address;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.critterm.lifescore.services.MapsService;

@Entity
public class Address {

    @Id
    private Long id = 1L;
    private String address;
    private String neighborhood;
    private String city;
    private String zipcode;
    private String workAddress;

    @Column(nullable = true)
    private Integer lifescore;

    public Address(String address) {
        this.address = address;
        this.neighborhood = MapsService.detectNeighborhood(address);
        this.lifescore = 0;

    }

    public Address(String address, String workAddress) {
        this.address = address;
        this.neighborhood = MapsService.detectNeighborhood(address);
        this.workAddress = workAddress;
        this.lifescore = 0;
    }

    public Address() {
        this.address = "";
        this.lifescore = 0;
    }

    public String getAddress() {
        return address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Integer getLifescore(){
        return lifescore;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setLifescore(Integer score){
        this.lifescore = score;
    }
}
