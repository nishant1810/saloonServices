package com.nishant.salon.service.mapper;


import com.nishant.salon.service.modal.Salon;
import com.nishant.salon.service.payload.DTO.SalonDTO;

public class SalonMapper {

    public static SalonDTO salonToSalonDTO(Salon salon) {
        SalonDTO salonDTO = new SalonDTO();

        salonDTO.setId(salon.getId());
        salonDTO.setName(salon.getName());
        salonDTO.setOwnerId(salon.getOwnerId());
        salonDTO.setImages(salon.getImages());
//        salonDTO.setEmail(salon.getEmail());
        salonDTO.setAddress(salon.getAddress());
        salonDTO.setPhoneNumber(salon.getPhoneNumber());
        salonDTO.setOpenTime(salon.getOpenTime());
        salonDTO.setCloseTime(salon.getCloseTime());
        salonDTO.setCity(salon.getCity());

        return salonDTO;
    }
}
