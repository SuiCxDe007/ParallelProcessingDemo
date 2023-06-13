package com.suicxde.parallelprocessingdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DemoResource {

    @GetMapping("/getAirline/{id}")
    public Airline getAirline(@PathVariable String id){
        Airline airline = DemoService.getAirlineById(id);
        return airline;
    }

}
