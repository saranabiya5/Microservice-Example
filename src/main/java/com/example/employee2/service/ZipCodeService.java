package com.example.employee2.service;

import com.example.employee2.client.ZipCodeClient;
import com.example.employee2.model.Location;
import org.springframework.beans.factory.annotation.Autowired;

public class ZipCodeService {

    private final ZipCodeClient zipCodeClient;
    @Autowired
    public ZipCodeService(ZipCodeClient zipCodeClient)
    {
        this.zipCodeClient = zipCodeClient;
    }

    public Location fetchLocations()
    {
        return zipCodeClient.fetchLocations();
    }
}
