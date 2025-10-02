package com.nishant.category.service.service;

import com.nishant.category.service.CategoryServiceApplication;
import com.nishant.category.service.DTO.SalonDTO;
import com.nishant.category.service.modal.Category;

import java.util.Set;

public interface CategoryService {

    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoriesBySalon(Long id);
    Category getCategoryById(Long id) throws Exception;
    void deleteCategoryById(Long id, Long salonId) throws Exception;
}