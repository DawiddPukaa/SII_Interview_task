package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.myConference.SIIProject.domain.confobjs.lecture.AssignUserCommand;
import com.myConference.SIIProject.domain.user.CreateUserCommand;
import lombok.Value;

import java.util.UUID;

@Value
public class UserAssignToLectureRequest {
    UUID userId;
    int thematicPathId;
    int lectureId;
    @JsonCreator
    public UserAssignToLectureRequest(
            @JsonProperty("name") UUID userId,
            @JsonProperty("secondName") int thematicPathId,
            @JsonProperty("username") int lectureId
    ) {
        this.userId = userId;
        this.thematicPathId = thematicPathId;
        this.lectureId = lectureId;
    }

    public AssignUserCommand  toDomainCommand() {
        return new AssignUserCommand(userId, thematicPathId,lectureId);
    }
}
