package com.travelroute.domain.model.user.exception;

import com.travelroute.domain.model.common.exception.BusinessException;
import com.travelroute.domain.model.common.exception.ExceptionCode;

public class UserDomainInvalidException extends BusinessException {

    public UserDomainInvalidException(ExceptionCode exceptionCode, String message) {
        super(exceptionCode, message);
    }
}
