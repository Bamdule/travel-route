package com.travelroute.presentation.travel;

import com.travelroute.application.travel.TravelCommand;
import com.travelroute.domain.model.travel.Country;

import java.time.LocalDate;

public class TravelRequest {
    private TravelRequest() {
    }

    public record TravelSaveRequest(String name, Country country, LocalDate startDate, LocalDate endDate, Long userId) {
        public TravelCommand.Save to() {
            return new TravelCommand.Save(this.name, this.country, this.startDate, this.endDate, this.userId);
        }
    }
}
