package com.tarelko.travel.tourservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.tarelko.travel.tourservice.entity.Tour;

import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl implements TourService {
    @Override
    public Tour getByUid(UUID uuid) {
        return Tour.builder()
                .title("Tour 1")
                .description("Description value")
                .tags(Arrays.asList("Tag 1", "Tag 2"))
                .build();
    }

    @Override
    public List<Tour> getAll() {
        return IntStream.range(1, 10)
                .mapToObj(operand -> Tour.builder()
                        .title("Tour " + operand)
                        .description("Description value")
                        .tags(List.of("Tag " + operand))
                        .build())
                .collect(Collectors.toList());
    }
}
