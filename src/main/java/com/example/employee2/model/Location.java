package com.example.employee2.model;

import lombok.Data;

import java.util.List;

@Data
public class Location {
    private String postCode;
    private String country;
    private String countryAbbreviation;
    private List<Place> places;
}