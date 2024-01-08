package com.travelroute.domain.model.travel;

import com.travelroute.domain.model.common.exception.ExceptionCode;
import com.travelroute.domain.model.travel.exception.TravelDomainInvalidException;

import java.time.LocalDate;

public record TravelDate(
    LocalDate startDate,
    LocalDate endDate
) {

    public TravelDate {

        if (startDate == null) {
            throw new TravelDomainInvalidException(ExceptionCode.TRAVEL_START_DATE_REQUIRED);
        }

        if (endDate == null) {
            throw new TravelDomainInvalidException(ExceptionCode.TRAVEL_START_END_REQUIRED);
        }

        if (startDate.isAfter(endDate)) {
            throw new TravelDomainInvalidException(ExceptionCode.TRAVEL_START_DATE_INVALID);
        }
    }
}