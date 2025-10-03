package com.nishant.service.offering.service;

import com.nishant.category.service.DTO.SalonDTO;
import com.nishant.service.offering.DTO.CategoryDTO;
import com.nishant.service.offering.DTO.ServiceDTO;
import com.nishant.service.offering.modal.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {

    ServiceOffering createService(CategoryDTO categoryDTO, SalonDTO salonDTO, ServiceDTO serviceDTO);
    ServiceOffering updateService(Long serviceId, ServiceOffering service) throws Exception;
    Set<ServiceOffering> getAllServiceBySalonId(Long serviceId, Long categoryId);
    Set<ServiceOffering> getServicesByIds(Set<Long> ids);
    ServiceOffering getServiceById(Long id) throws Exception;

}
