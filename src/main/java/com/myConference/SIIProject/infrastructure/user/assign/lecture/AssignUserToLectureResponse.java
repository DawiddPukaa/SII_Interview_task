package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AssignUserToLectureResponse {

    String userId;
    Integer lectureId;


    public static AssignUserToLectureResponse fromDomain(AssignUserToLectureResult assignUserToLectureResult) {
        return new AssignUserToLectureResponse(
                assignUserToLectureResult
                        .getUserAssignedToLecture()
                        .getUserAccount()
                        .getId()
                        .toString(),
                assignUserToLectureResult
                        .getUserAssignedToLecture()
                        .getLectures()
                        .getId());
    }
}
