package com.travelroute.application.travel;

import com.travelroute.domain.model.travel.Travel;
import com.travelroute.domain.model.travel.TravelDate;
import com.travelroute.domain.repository.travel.TravelStore;
import org.springframework.stereotype.Service;

@Service
public class TravelApplicationServiceImpl implements TravelApplicationService {

    private final TravelStore travelStore;

    public TravelApplicationServiceImpl(TravelStore travelStore) {
        this.travelStore = travelStore;
    }

    @Override
    public TravelResult.TravelData save(TravelCommand.Save command) {

        Travel travel = new Travel(
            command.name(),
            command.country(),
            new TravelDate(
                command.startDate(),
                command.endDate()
            ),
            command.userId()
        );

        return TravelResult.TravelData.of(travelStore.save(travel));
    }
}
