package com.tarelko.travel.tourservice.entity;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class Tour {

    private UUID uuid;
    private String title;
    private String description;
    private List<String> tags;


}
