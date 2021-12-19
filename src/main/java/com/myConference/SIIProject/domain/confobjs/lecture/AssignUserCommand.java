package com.myConference.SIIProject.domain.confobjs.lecture;

import lombok.AllArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
public class AssignUserCommand {

    UUID userId;
    int thematicPathId;
    int lectureId;

}
