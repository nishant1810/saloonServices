package com.nishant.category.service.DTO;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class SalonDTO {

    private Long id;
    private String name;
    private List<String> services;
    private List<String> images;
    private String address;
    private String phoneNumber;
    private String email;
    private String city;
    private long ownerId;
    private LocalTime openTime;
    private LocalTime closeTime;
}
