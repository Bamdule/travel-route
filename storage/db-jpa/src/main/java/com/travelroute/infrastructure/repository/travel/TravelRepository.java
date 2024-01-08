package com.travelroute.infrastructure.repository.travel;

import com.travelroute.infrastructure.entity.travel.TravelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelEntity, Long> {
}
