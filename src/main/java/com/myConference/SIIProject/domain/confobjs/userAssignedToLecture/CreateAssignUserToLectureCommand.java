package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CreateAssignUserToLectureCommand {
    String username;
    int lectureId;
}
