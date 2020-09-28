package com.mrn.roaver_mars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RoverMarsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void smallTest() {
        RestTemplate rest = new RestTemplate();

        ResponseEntity<String> response =
                rest.getForEntity(
                        "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY",
                        String.class);

        System.out.println(response.getBody());

    }

}
