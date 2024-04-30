package com.example.employee2.controller;

import com.example.employee2.model.Location;
import com.example.employee2.service.ZipCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
public class ZipCodeController {

    ZipCodeService zipCodeServiceObj;

    @Autowired
    public ZipCodeController (ZipCodeService zipCodeServiceObj){
        this.zipCodeServiceObj = zipCodeServiceObj;
    }

    @GetMapping(value = "/{zipcode}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Location> fetchLocations(@PathVariable long zipcode){

        log.info("In Controller: Get Request");
        return ResponseEntity.ok(zipCodeServiceObj.fetchLocations(zipcode));
    }
}
