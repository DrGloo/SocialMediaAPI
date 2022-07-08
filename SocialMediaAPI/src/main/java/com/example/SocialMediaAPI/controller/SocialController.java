package com.example.SocialMediaAPI.controller;
import com.example.SocialMediaAPI.model.SocialRequestModel;
import com.example.SocialMediaAPI.service.SocialService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SocialController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    SocialService socialService;

    @PostMapping("/hello")
    public Object hello(@RequestBody SocialRequestModel requestBody) {
        logger.info("endpoint /hello query hit sucessfully");
        return socialService.getSocial(requestBody);
    }

    @GetMapping("/test")
    public Object city(){
        logger.info("endpoint /test query hit sucessfully");
        return 1;
        //return weatherService.callWeatherAPI((float) -71.00, 42.00F);
    }

}
