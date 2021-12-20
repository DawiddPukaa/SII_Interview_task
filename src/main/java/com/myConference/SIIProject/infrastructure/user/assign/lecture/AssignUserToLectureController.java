package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.CreateAssignUserToLectureCommand;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/api/assign")
@AllArgsConstructor
public class AssignUserToLectureController {

    private final AssignUserToLectureService assignUserToLectureService;

     @PostMapping(path = "/user-to-lecture", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public AssignUserToLectureResponse signup(@RequestBody AssignUserToLectureRequest assignUserToLectureRequest) {

        CreateAssignUserToLectureCommand command = assignUserToLectureRequest.toDomainCommand();

        AssignUserToLectureResult assignUserToLectureResult = assignUserToLectureService.assignUserToLecture(command);

        return AssignUserToLectureResponse.fromDomain(assignUserToLectureResult);

    }
    //@GetMapping


}
