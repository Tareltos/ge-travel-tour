package com.tarelko.travel.tourservice.controller;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TourController.class)
@ComponentScan("com.tarelko.travel.tourservice.service")
class TourControllerTest {

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void getTourById_success() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/tours/{id}", UUID.randomUUID()))
                .andExpect(status().isOk());
    }

    @Test
    public void getTours_success() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/tours"))
                .andExpect(status().isOk());
    }
}