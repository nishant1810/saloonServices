package com.nishant.category.service.modal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(unique=false)
    private String name;

    @Column(nullable=false)
    private String image;

    @Column
    private Long salonId;



}
