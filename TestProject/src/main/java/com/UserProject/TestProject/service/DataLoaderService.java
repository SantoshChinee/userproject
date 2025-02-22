package com.UserProject.TestProject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DataLoaderService {

    @Autowired
    private RestTemplate restTemplate;

    public void fetchUsersFromExternalAPI() {
        String url = "https://dummyjson.com/users";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("API Response: " + response);
    }
}
