package com.tarelko.travel.tourservice.controller;

import java.util.List;
import java.util.UUID;

import com.tarelko.travel.tourservice.entity.Tour;
import com.tarelko.travel.tourservice.service.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("tours")
    public List<Tour> getAll() {
        return tourService.getAll();
    }

    @GetMapping("tours/{id}")
    public Tour getById(@PathVariable("id") UUID uuid) {
        return tourService.getByUid(uuid);
    }

}
