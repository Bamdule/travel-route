package com.travelroute.application.travel;

import com.travelroute.domain.model.travel.Country;
import com.travelroute.domain.model.travel.Travel;

import java.time.LocalDate;

public class TravelResult {

    private TravelResult() {
    }

    public record TravelData(Long id, String name, Country country, LocalDate startDate, LocalDate endDate,
                             Long userId) {

        public static TravelData of(Travel travel) {
            return new TravelData(
                travel.getId(),
                travel.getName(),
                travel.getCountry(),
                travel.getTravelDate().startDate(),
                travel.getTravelDate().endDate(),
                travel.getUserId()
            );
        }

    }

}
