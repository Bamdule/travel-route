package com.travelroute.domain.model.travel.exception;

import com.travelroute.domain.model.common.exception.BusinessException;
import com.travelroute.domain.model.common.exception.ExceptionCode;

public class TravelDomainInvalidException extends BusinessException {


    public TravelDomainInvalidException(ExceptionCode exceptionCode) {
        super(exceptionCode);
    }
}
