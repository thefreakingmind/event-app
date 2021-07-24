package com.api.glendatasubmission.api;

import com.api.glendatasubmission.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EventAPI {

    @Autowired
    private EventService eventService;


    @GetMapping("/health")
    public String healthController(){
        log.info("Health Controller");
        return "API is Up!!!";
    }

}
