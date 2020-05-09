package com.rg.egen.service;

import com.rg.egen.entity.Reading;

import java.util.List;

public interface ReadingService {

    List<Reading> findAll();

    Reading findOne(String id);

    Reading create(Reading reading);

}
