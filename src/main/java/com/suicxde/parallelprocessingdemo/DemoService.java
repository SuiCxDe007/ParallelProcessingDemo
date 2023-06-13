package com.suicxde.parallelprocessingdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    private static String baseURL = "https://api.instantwebtools.net/v1/airlines/";

    public static Airline getAirlineById(String id) {
        String airlineUrl = baseURL + id;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Airline> response = restTemplate.getForEntity(airlineUrl, Airline.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to retrieve airline information. Status code: " + response.getStatusCodeValue());
        }

    }
}
