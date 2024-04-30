package com.example.employee2.client;

//import com.example.employee2.config.FeignConfig;
//import com.example.employee2.model.Employee;
import com.example.employee2.model.Location;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "zipCodeExternalService",
        url = "https://api.zippopotam.us/us")
        //configuration = FeignConfig.class)

public interface ZipCodeClient {

    //@GetMapping("33162")
    //@Cacheable("zipcode")
    @RequestMapping("/{zipcode}")
    Location fetchLocations(@RequestParam("zipcode") long zipcode);
}
