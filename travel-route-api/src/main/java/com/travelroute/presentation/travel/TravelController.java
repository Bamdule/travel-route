package com.travelroute.presentation.travel;

import com.travelroute.application.travel.TravelApplicationService;
import com.travelroute.application.travel.TravelResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/v1/travels")
@RestController
public class TravelController {

    private final TravelApplicationService travelApplicationService;

    public TravelController(TravelApplicationService travelApplicationService) {
        this.travelApplicationService = travelApplicationService;
    }

    @PostMapping
    ResponseEntity<TravelResponse.TravelSaveResponse> saveTravel(@RequestBody TravelRequest.TravelSaveRequest request) {
        TravelResult.TravelData result = travelApplicationService.save(request.to());
        return ResponseEntity.ok(TravelResponse.TravelSaveResponse.of(result));
    }
}
