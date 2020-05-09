package com.rg.egen.controller;

import com.rg.egen.entity.Reading;
import com.rg.egen.repository.ReadingsRepository;
import com.rg.egen.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/readings")
@CrossOrigin(origins = "http://mocker.egen.academy")
public class ReadingContoller {

    private final ReadingService service;

    @Autowired
    public ReadingContoller(ReadingService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Reading> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Reading create(@RequestBody Reading reading) {
        System.out.println("Creating Reading record");
        return service.create(reading);
    }
}
