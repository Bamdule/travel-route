package com.travelroute.domain.model.user;

import com.travelroute.domain.model.common.exception.ExceptionCode;
import com.travelroute.domain.model.user.exception.UserDomainInvalidException;

import java.util.Objects;

public record UserName(
    String value
) {
    public static final int MIN_LENGTH = 3;
    public static final int MAX_LENGTH = 20;

    public UserName {
        Objects.requireNonNull(value, "회원 이름은 필수 값입니다.");


        if (value.length() < MIN_LENGTH) {
            String message = String.format("""
                [%s] 회원 이름은 %d글자 이상이어야합니다.
                """, value, MIN_LENGTH);

            throw new UserDomainInvalidException(ExceptionCode.USER_NAME_LENGTH_INVALID, message);
        }

        if (value.length() > MAX_LENGTH) {
            String message = String.format("""
                [%s] 회원 이름은 %d글자 이하여야합니다.
                """, value, MAX_LENGTH);

            throw new UserDomainInvalidException(ExceptionCode.USER_NAME_LENGTH_INVALID, message);
        }
    }
}
