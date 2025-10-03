package com.nishant.service.offering.controller;

import com.nishant.category.service.DTO.SalonDTO;
import com.nishant.service.offering.DTO.CategoryDTO;
import com.nishant.service.offering.DTO.ServiceDTO;
import com.nishant.service.offering.modal.ServiceOffering;
import com.nishant.service.offering.service.ServiceOfferingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/service-offering/salon-owner")
public class SalonServiceOfferingController {

    private final ServiceOfferingService serviceOfferingService;

    @PostMapping("/salon/{salonId}")
    public ResponseEntity<ServiceOffering> createService(@RequestBody ServiceDTO serviceDTO) {
        SalonDTO salonDTO = new SalonDTO();
        salonDTO.setId(1L); // later replace with salonId from @PathVariable

        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(serviceDTO.getCategoryId());

        ServiceOffering serviceOfferings = serviceOfferingService.createService(categoryDTO, salonDTO, serviceDTO);
        return ResponseEntity.ok(serviceOfferings);
    }

    @PutMapping("/{serviceId}")
    public ResponseEntity<ServiceOffering> updateService(
            @PathVariable Long serviceId,
            @RequestBody ServiceOffering serviceOffering) throws Exception {

        ServiceOffering updatedService = serviceOfferingService.updateService(serviceId, serviceOffering);
        return ResponseEntity.ok(updatedService);
    }

}
