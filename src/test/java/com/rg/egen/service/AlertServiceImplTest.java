package com.rg.egen.service;

import com.rg.egen.entity.Alert;
import com.rg.egen.repository.AlertRepository;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlertServiceImplTest {


    @MockBean
    private AlertRepository repository;

    @Autowired
    private AlertService service;
//
    @Test
    public void findAlertsByPriority() throws Exception {
        String s = new String("test");
        Alert alertsArray[] = new Alert[2];
        alertsArray[0] = new Alert();
        alertsArray[0].setDescription("High Engine Rpm");
        alertsArray[0].setLatitude(65.2274);
        alertsArray[0].setLongitude(120.7181);

        alertsArray[0].setPriority("HIGH");
        alertsArray[0].setVin("1HGCR2F3XFA027534");
        alertsArray[0].setId(94);

        alertsArray[1] = new Alert();
        alertsArray[1].setDescription("High Engine Rpm");
        alertsArray[1].setLatitude(65.2274);
        alertsArray[1].setLongitude(120.7181);

        alertsArray[1].setPriority("HIGH");
        alertsArray[1].setVin("1HGCR2F3XFA027534");
        alertsArray[1].setId(94);

        when(repository.findByPriority(s)).thenReturn(Stream.of(alertsArray).collect(Collectors.toList()));
        assertEquals(2, service.findAlertsByPriority(s).size());
    }



    @Test
    public void findAlertsByVin() throws Exception {
        String s = new String("test");
        Alert alertsArray[] = new Alert[2];
        alertsArray[0] = new Alert();
        alertsArray[0].setDescription("High Engine Rpm");
        alertsArray[0].setLatitude(65.2274);
        alertsArray[0].setLongitude(120.7181);

        alertsArray[0].setPriority("HIGH");
        alertsArray[0].setVin("1HGCR2F3XFA027534");
        alertsArray[0].setId(94);

        alertsArray[1] = new Alert();
        alertsArray[1].setDescription("High Engine Rpm");
        alertsArray[1].setLatitude(65.2274);
        alertsArray[1].setLongitude(120.7181);

        alertsArray[1].setPriority("HIGH");
        alertsArray[1].setVin("1HGCR2F3XFA027534");
        alertsArray[1].setId(94);

        when(repository.findByVin(s)).thenReturn(Stream.of(alertsArray).collect(Collectors.toList()));
        assertEquals(2, service.findAlertsByVin(s).size());

    }


    @Test
    public void create() throws Exception {
        Alert alert = new Alert();
        alert.setDescription("High Engine Rpm");
        alert.setLatitude(65.2274);
        alert.setLongitude(120.7181);

        alert.setPriority("HIGH");
        alert.setVin("1HGCR2F3XFA027534");
        alert.setId(94);

        when(repository.save(alert)).thenReturn(alert);
        assertEquals(alert, service.create(alert));
    }

}