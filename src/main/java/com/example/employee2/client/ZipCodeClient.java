package com.example.employee2.client;

import com.example.employee2.model.Employee;
import com.example.employee2.model.Location;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "zipCodeExternalService",
        url = "https://api.zippopotam.us/us/33162")

public interface ZipCodeClient {

    @GetMapping("/")
    Location fetchLocations();
}
