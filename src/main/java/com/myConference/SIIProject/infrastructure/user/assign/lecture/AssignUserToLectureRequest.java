package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.CreateAssignUserToLectureCommand;
import lombok.Value;

import java.util.UUID;

@Value
public class AssignUserToLectureRequest {

    UUID userId;
    int lectureId;

    @JsonCreator
    public AssignUserToLectureRequest(
            @JsonProperty("name") UUID userId,
            @JsonProperty("secondName") int lectureId

    ) {
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public CreateAssignUserToLectureCommand toDomainCommand() {return new CreateAssignUserToLectureCommand(userId,lectureId);}
}
