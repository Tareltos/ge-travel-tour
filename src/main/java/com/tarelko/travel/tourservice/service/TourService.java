package com.tarelko.travel.tourservice.service;

import java.util.List;
import java.util.UUID;

import com.tarelko.travel.tourservice.entity.Tour;

public interface TourService {

    Tour getByUid(UUID uuid);

    List<Tour> getAll();
}
