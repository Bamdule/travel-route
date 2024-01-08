package com.travelroute.domain.repository.travel;

import com.travelroute.domain.model.travel.Travel;

public interface TravelStore {
    Travel save(Travel travel);
}
