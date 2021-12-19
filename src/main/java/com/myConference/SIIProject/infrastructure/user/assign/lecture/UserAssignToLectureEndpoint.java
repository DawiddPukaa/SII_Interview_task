package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.myConference.SIIProject.domain.confobjs.lecture.AssignUserCommand;
import com.myConference.SIIProject.infrastructure.api.user.authentication.SignupResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/assign")
@AllArgsConstructor
public class UserAssignToLectureEndpoint {

    private final UserAssignToLectureService userAssignToLectureSerwice;

    @PostMapping(path = "/lecture", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public SignupResponse signup(@RequestBody UserAssignToLectureRequest assignRequest) {
        AssignUserCommand command = assignRequest.toDomainCommand();

        UserAssignToLectureResponse userAssignToLectureResponse = userAssignToLectureSerwice.signupNewUser(command);

        return SignupResponse.fromDomain(signupResult);
    }

}
