package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.CreateAssignUserToLectureCommand;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/assign")
@AllArgsConstructor

public class AssignUserToLectureEndPoint {

    private final AssignUserToLectureService assignUserToLectureService;

    @PostMapping(path = "/user-to-lecture", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public AssignUserToLectureResponse signup(@RequestBody AssignUserToLectureRequest assignUserToLectureRequest) {
        CreateAssignUserToLectureCommand command = assignUserToLectureRequest.toDomainCommand();

        AssignUserToLectureResult assignUserToLectureResult = assignUserToLectureService.assignUserToLecture(command);

        return AssignUserToLectureResponse.fromDomain(assignUserToLectureResult);
    }

}
