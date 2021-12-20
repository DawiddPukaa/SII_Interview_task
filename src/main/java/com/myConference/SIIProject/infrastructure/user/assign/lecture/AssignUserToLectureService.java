package com.myConference.SIIProject.infrastructure.user.assign.lecture;

import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.AssignUserToLectureCreator;
import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.CreateAssignUserToLectureCommand;
import com.myConference.SIIProject.domain.confobjs.userAssignedToLecture.UserAssignedToLecture;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor

public class AssignUserToLectureService {

    private final AssignUserToLectureCreator assignUserToLectureCreator;


    public AssignUserToLectureResult assignUserToLecture(CreateAssignUserToLectureCommand command) {

        UserAssignedToLecture userAssignedToLecture = assignUserToLectureCreator.create(command);
        return new AssignUserToLectureResult(userAssignedToLecture);
    }

}
