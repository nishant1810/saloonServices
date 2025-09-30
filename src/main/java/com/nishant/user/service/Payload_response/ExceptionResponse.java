package com.nishant.user.service.Payload_response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDataTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ExceptionResponse {
    private String message;
    private String error;
    private LocalDateTime timestamp;
}
