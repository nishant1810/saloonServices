package com.nishant.salon.service.payload.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String fullName;
    private String email;

}
