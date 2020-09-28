package com.mrn.roaver_mars.controllers;

import com.mrn.roaver_mars.response.MarsRoverApiResponse;
import com.mrn.roaver_mars.services.MarsRoverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final MarsRoverService marsRoverService;

    public HomeController(MarsRoverService marsRoverService) {
        this.marsRoverService = marsRoverService;
    }

    @GetMapping(value = {"/", ""})
    public String getHomeView(ModelMap model) {
        MarsRoverApiResponse roverData = marsRoverService.getRoverData();
        model.put("roverData", roverData);
        return "index";
    }
}
