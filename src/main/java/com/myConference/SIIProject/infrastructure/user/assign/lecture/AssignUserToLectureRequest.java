package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.CreateAssignUserToLectureCommand;
import lombok.Value;

@Value
public class AssignUserToLectureRequest {

    Integer lectureId;

    @JsonCreator
    public AssignUserToLectureRequest(
            @JsonProperty("lectureId") Integer lectureId

    ) {
        this.lectureId = lectureId;
    }

    public CreateAssignUserToLectureCommand toDomainCommand() {return new CreateAssignUserToLectureCommand(lectureId);}
}
