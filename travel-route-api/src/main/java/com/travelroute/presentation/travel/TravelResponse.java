package com.travelroute.presentation.travel;

import com.travelroute.application.travel.TravelResult;
import com.travelroute.domain.model.travel.Country;

import java.time.LocalDate;

public class TravelResponse {

    private TravelResponse() {
    }

    public record TravelSaveResponse(TravelData user) {
        public static TravelSaveResponse of(TravelResult.TravelData data) {
            return new TravelSaveResponse(TravelData.of(data));
        }
    }

    public record TravelData(Long id, String name, Country country, LocalDate startDate, LocalDate endDate,
                             Long userId) {
        public static TravelData of(TravelResult.TravelData data) {
            return new TravelData(
                data.id(), data.name(), data.country(), data.startDate(), data.endDate(), data.userId()
            );
        }
    }
}
