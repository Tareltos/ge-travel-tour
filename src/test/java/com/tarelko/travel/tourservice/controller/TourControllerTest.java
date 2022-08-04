package com.tarelko.travel.tourservice.controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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
                .andExpect(status().isOk())
                .andExpect(content().json(getResourceAsString("getByIdResponse.json")));
    }

    @Test
    public void getTours_success() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/v1/tours"))
                .andExpect(status().isOk())
                .andExpect(content().json(getResourceAsString("getAllResponse.json")));
    }


    private String getResourceAsString(String fileName) throws IOException {
        return IOUtils.toString(
                Objects.requireNonNull(this.getClass().getResourceAsStream(fileName)),
                Charset.defaultCharset());
    }
}