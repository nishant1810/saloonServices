package com.nishant.salon.service.service.impl;

import com.nishant.salon.service.modal.Salon;
import com.nishant.salon.service.payload.DTO.SalonDTO;
import com.nishant.salon.service.payload.DTO.UserDTO;
import com.nishant.salon.service.repository.SalonRepository;
import com.nishant.salon.service.service.SalonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalonServiceImpl implements SalonService {

    private final SalonRepository salonRepository;

    @Override
    public Salon createSalon(SalonDTO req, UserDTO user) {
        Salon salon = new Salon();
        salon.setName(req.getName());
        salon.setAddress(req.getAddress());
        salon.setEmail(req.getEmail());
        salon.setCity(req.getCity());
        salon.setImages(req.getImages());
        salon.setOwnerId(user.getId());
        salon.setOpenTime(req.getOpenTime());
        salon.setCloseTime(req.getCloseTime());
        salon.setPhoneNumber(req.getPhoneNumber());
        return salonRepository.save(salon);
    }

    @Override
    public Salon updateSalon(SalonDTO salonDTO, UserDTO user, Long salonId) throws Exception {

        Salon existingSalon = salonRepository.findById(salonId).orElse(null);

        if (existingSalon != null && existingSalon.getOwnerId() == user.getId()) {
            existingSalon.setName(salonDTO.getName());
            existingSalon.setAddress(salonDTO.getAddress());
            existingSalon.setCity(salonDTO.getCity());
            existingSalon.setEmail(salonDTO.getEmail());
            existingSalon.setImages(salonDTO.getImages());
            existingSalon.setOwnerId(user.getId());
            existingSalon.setOpenTime(salonDTO.getOpenTime());
            existingSalon.setCloseTime(salonDTO.getCloseTime());
            existingSalon.setPhoneNumber(salonDTO.getPhoneNumber());

            return salonRepository.save(existingSalon);
        } else {
            throw new Exception("Salon does not exist or you are not the owner");
        }
    }

    @Override
    public List<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    @Override
    public Salon getSalonById(Long salonId) throws Exception {
        Salon salon = salonRepository.findById(salonId).orElse(null);
        if (salon == null) {
            throw new Exception("Salon does not exist");
        }
        return salon;
    }

    @Override
    public Salon getSalonByOwnerId(Long ownerId) {
        return salonRepository.findByOwnerId(ownerId);
    }

    @Override
    public List<Salon> searchSalonByCity(String city) {
        return salonRepository.searchSalons(city);
    }
}
