package com.rg.egen.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.rg.egen.entity.Alert;
import com.rg.egen.entity.Reading;
import com.rg.egen.repository.ReadingsRepository;
import com.rg.egen.repository.VehicleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadingServiceImplTest {

    @MockBean
    ReadingsRepository repository;

    @MockBean
    VehicleRepository vRepository;

    @Autowired
    private ReadingService service;

    @Test
    public void findAll() throws Exception {

        Reading readingsArray[] = new Reading[2];
        readingsArray[0] = new Reading();
        readingsArray[0].setCheckEngineLightOn(false);
        readingsArray[0].setSpeed(20);

        readingsArray[1] = new Reading();
        readingsArray[1].setCheckEngineLightOn(false);
        readingsArray[1].setSpeed(20);

        when(repository.findAll()).thenReturn(Stream.of(readingsArray).collect(Collectors.toList()));
        assertEquals(2, service.findAll().size());

    }

    @Test
    public void findOne() throws Exception {
        String id = new String("WBAFR1C50BC747531");
        Reading readingsArray[] = new Reading[2];
        readingsArray[0] = new Reading();
        readingsArray[0].setCheckEngineLightOn(false);
        readingsArray[0].setSpeed(20);
        readingsArray[0].setVin("WBAFR1C50BC747531");

        readingsArray[1] = new Reading();
        readingsArray[1].setCheckEngineLightOn(false);
        readingsArray[1].setSpeed(20);
        readingsArray[1].setVin("WBAFR1C50BC747531");

        when(repository.findAll()).thenReturn(Stream.of(readingsArray).collect(Collectors.toList()));
        assertEquals(2, service.findAll().size());

    }

    @Test
    public void create() throws Exception {
        String vin = new String("WBAFR1C50BC747531");
        Reading readings = new Reading();
        readings.setCheckEngineLightOn(false);
        readings.setSpeed(20);
        readings.setVin("WBAFR1C50BC747531");
        readings.setTimestamp(Timestamp.valueOf("2007-09-23 10:10:10.0"));

        when(repository.save(readings)).thenReturn(readings);
        when(vRepository.findByVin(vin)).thenReturn(Optional.empty());
        assertEquals(readings, service.create(readings));

    }

}