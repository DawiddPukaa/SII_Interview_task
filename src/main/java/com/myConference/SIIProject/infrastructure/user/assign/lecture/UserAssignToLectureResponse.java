package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.myConference.SIIProject.domain.confobjs.lecture.UserAssignedLecture;
import lombok.AllArgsConstructor;
import lombok.Value;


@Value
@AllArgsConstructor
public class UserAssignToLectureResponse {

    UserAssignedLecture userAssignedLecture;
    public static UserAssignToLectureResponse fromDomain(UserAssignedLecture userAssignedLecture) {
        return new UserAssignToLectureResponse(userAssignedLecture);
    }

}
