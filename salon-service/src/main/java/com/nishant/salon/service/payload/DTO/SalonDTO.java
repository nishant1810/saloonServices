package com.nishant.salon.service.payload.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class SalonDTO {

    private Long id;

    private String name;

    private List<String>

    private String address;

    private String phoneNumber;

    private String email;

    private String city;

    private long ownerId;

    private LocalTime openTime;

    private LocalTime closeTime;

}
