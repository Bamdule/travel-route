package com.travelroute.domain.model.user.exception;

import com.travelroute.domain.model.common.exception.BusinessException;
import com.travelroute.domain.model.common.exception.ExceptionCode;

public class UserAlreadyExistException extends BusinessException {


    public UserAlreadyExistException(ExceptionCode exceptionCode) {
        super(exceptionCode);
    }
}
