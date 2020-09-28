package com.mrn.roaver_mars.services;

import com.mrn.roaver_mars.response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverService {

    public MarsRoverApiResponse getRoverData() {
        RestTemplate template = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response =
                template.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY",
                        MarsRoverApiResponse.class);
        return response.getBody();
    }
}
