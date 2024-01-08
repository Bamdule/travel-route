package com.travelroute.domain.model.common.exception;

import org.springframework.http.HttpStatus;

public enum ExceptionCode {

    USER_ALREADY_EXIST(HttpStatus.BAD_REQUEST, "이미 존재하는 회원입니다."),
    USER_NAME_LENGTH_INVALID(HttpStatus.BAD_REQUEST, "회원 이름의 길이가 잘못되었습니다."),
    TRAVEL_START_DATE_INVALID(HttpStatus.BAD_REQUEST, "여행 시작일은 종료일 보다 이후일 수 없습니다."),
    TRAVEL_START_DATE_REQUIRED(HttpStatus.BAD_REQUEST, "여행 시작일은 필수 값입니다."),
    TRAVEL_START_END_REQUIRED(HttpStatus.BAD_REQUEST, "여행 종료일은 필수 값입니다."),
    ;


    private final HttpStatus status;
    private final String message;

    ExceptionCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
