package com.travelroute.presentation.user;

import com.travelroute.application.user.UserApplicationService;
import com.travelroute.application.user.UserResult;
import com.travelroute.domain.repository.user.UserQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserApplicationService userApplicationService;

    public UserController(UserApplicationService userApplicationService) {
        this.userApplicationService = userApplicationService;
    }


    @GetMapping
    ResponseEntity<Page<UserResponse.UserData>> findUsers(String name, @PageableDefault Pageable pageable) {

        Page<UserResponse.UserData> response = userApplicationService.findAll(new UserQuery.FindAllQuery(name), pageable)
            .map(UserResponse.UserData::of);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    ResponseEntity<UserResponse.UserRegisterResponse> registerUser(
        @RequestBody UserRequest.UserRegisterRequest request
    ) {
        UserResult.UserData result = userApplicationService.register(request.to());

        return ResponseEntity.ok(UserResponse.UserRegisterResponse.of(result));
    }
}
