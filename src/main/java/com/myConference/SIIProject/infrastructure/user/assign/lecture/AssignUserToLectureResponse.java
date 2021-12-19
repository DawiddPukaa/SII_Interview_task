package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AssignUserToLectureResponse {

 AssignUserToLectureResult assignUserToLectureResult;

    public static AssignUserToLectureResponse fromDomain(AssignUserToLectureResult assignUserToLectureResult) {
        return new AssignUserToLectureResponse(assignUserToLectureResult);
    }
}
