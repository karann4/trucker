package com.rg.egen.service;

import com.rg.egen.entity.Reading;
import com.rg.egen.entity.Vehicle;
import com.rg.egen.exception.VehicleNotFoundException;
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


//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class VehicleServiceImplTest {
//
//
//    @MockBean
//    VehicleRepository vRepository;
//
//    @Autowired
//    VehicleService service;
//
//
//    @Test
//    public void findAll() throws Exception {
//
//
//        Vehicle vehicleArray[] = new Vehicle[2];
//        vehicleArray[0] = new Vehicle();
//        vehicleArray[0].setMake("Honda");
//        vehicleArray[0].setVin("GHTH54HFHREJ");
//
//        vehicleArray[1] = new Vehicle();
//        vehicleArray[1].setMake("Honda");
//        vehicleArray[1].setVin("GHTH54HFHREJ");
//
//        when(vRepository.findAll()).thenReturn(Stream.of(vehicleArray).collect(Collectors.toList()));
//        assertEquals(2, service.findAll().size());
//    }
//
//
//    @Test
//    public void findOne() throws Exception {
//        String vin = new String("WBAFR1C50BC747531");
//        Vehicle vehicleArray = new Vehicle();
//        vehicleArray.setMake("Honda");
//        vehicleArray.setVin("GHTH54HFHREJ");
//        Optional<Vehicle> opt = Optional.of(vehicleArray);
//
//        when(vRepository.findByVin(vin)).thenReturn(opt);
//
//        assertEquals( opt.get(), service.findOne(vin));
//
//    }
//}

//    @Test
//    public void create() throws Exception {
//    }

//    @Test
//    public void update() throws Exception {
//    }
//
//    @Test
//    public void delete() throws Exception {
//    }
//
//}