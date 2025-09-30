package com.nishant.user.service.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import com.nishant.user.service.Payload_response.ExceptionResponse;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExcepectionHandler(Exception.class)
    public ResponseEntity<ExceptionHandler> ExceptionHandler(Exception ex, WebRequest req){
        ExceptionResponse response=new ExceptionResponse(){
            ex.getMessage(),
            req.getDescription(includeClientInfo:false), LocalDateTime.now()
        };
        return ResponseEntity.ok(response);
    }
}
