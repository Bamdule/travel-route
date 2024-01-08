package com.travelroute.domain.model.travel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TravelTest {

    @Test
    public void Travel_도메인_생성() {

        final Long id = 1L;
        final String name = "tom";
        final Country country = Country.ALBANIA;
        final TravelDate travelDate = new TravelDate(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 1));
        final Long userId = 1L;

        Travel travel = new Travel(
            id,
            name,
            country,
            travelDate,
            userId
        );

        Assertions.assertEquals(travel.getId(), id);
        Assertions.assertEquals(travel.getName(), name);
        Assertions.assertEquals(travel.getCountry(), country);
        Assertions.assertEquals(travel.getTravelDate(), travelDate);
        Assertions.assertEquals(travel.getUserId(), userId);
    }

}