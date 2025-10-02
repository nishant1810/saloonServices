package com.nishant.salon.service.service;

import com.nishant.salon.service.modal.Salon;
import com.nishant.salon.service.payload.DTO.SalonDTO;
import com.nishant.salon.service.payload.DTO.UserDTO;

import java.util.List;

public interface SalonService {
    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(SalonDTO salon, UserDTO user, Long salonId) throws Exception;

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId) throws Exception;

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);
}
