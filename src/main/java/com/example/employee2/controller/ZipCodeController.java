package com.example.employee2.controller;

import com.example.employee2.model.Location;
import com.example.employee2.service.ZipCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
public class ZipCodeController {

    @Autowired
    ZipCodeService zipCodeServiceObj;

    @GetMapping(value = "/", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Location> fetchLocations(){  //@PathVariable int zipCode

        log.info("In Controller: Get Request");
        return ResponseEntity.ok(zipCodeServiceObj.fetchLocations());
    }
}
