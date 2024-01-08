package com.travelroute.infrastructure.repository.travel;

import com.travelroute.domain.model.travel.Travel;
import com.travelroute.domain.repository.travel.TravelStore;
import com.travelroute.infrastructure.entity.travel.TravelEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TravelStoreImpl implements TravelStore {
    private final TravelRepository travelRepository;

    public TravelStoreImpl(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    @Override
    public Travel save(Travel travel) {
        return travelRepository.save(TravelEntity.of(travel)).to();
    }
}
