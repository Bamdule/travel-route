package com.travelroute.application.travel;

import com.travelroute.domain.model.travel.Country;

import java.time.LocalDate;

public class TravelCommand {

    private TravelCommand() {
    }

    public record Save(String name, Country country, LocalDate startDate, LocalDate endDate, Long userId) {
    }

}
