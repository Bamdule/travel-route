package com.travelroute.application.travel;

public interface TravelApplicationService {

    TravelResult.TravelData save(TravelCommand.Save command);

}
