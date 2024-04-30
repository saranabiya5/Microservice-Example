package com.example.employee2.service;

import com.example.employee2.client.ZipCodeClient;
import com.example.employee2.model.Location;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ZipCodeService {

    private final ZipCodeClient zipCodeClient;
    @Autowired
    public ZipCodeService(ZipCodeClient zipCodeClient)
    {
        this.zipCodeClient = zipCodeClient;
    }

    @Cacheable("zipcode")
    public Location fetchLocations(long zipcode)
    {
        log.info("In Service Class");
        return zipCodeClient.fetchLocations(zipcode);
    }
}
