package com.travelroute.common;

import com.travelroute.domain.model.common.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    public Logger log = LoggerFactory.getLogger(this.getClass());


    @ExceptionHandler(BusinessException.class)
    ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {
        return ResponseEntity.status(e.getExceptionCode().getStatus())
            .body(create(e));
    }

    public ErrorResponse create(BusinessException e) {

        log.info("", e);

        return new ErrorResponse(
            e.getMessage(),
            e.getExceptionCode().name()
        );
    }


}
