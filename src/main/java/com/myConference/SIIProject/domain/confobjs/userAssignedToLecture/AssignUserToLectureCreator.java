package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import com.myConference.SIIProject.domain.user.account.UserAccountRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AssignUserToLectureCreator {

    private final UserAccountRepository userAccountRepository;
    private final AssignUserToLectureRepository assignUserToLectureRepository;


    public UserAssignedToLecture create(CreateAssignUserToLectureCommand command) {

        UserAccount userAccount = userAccountRepository.findByUsername(command.username)
                .orElseThrow(() -> new IllegalStateException("No such user with usename: " + command.username));

        UserAssignedToLecture createdUserAssignedToLecture = assignUserToLectureRepository.save(UserAssignedToLecture.builder()
                .lectureId(command.lectureId)
                .userID(userAccount.getId())
                .build());

        return assignUserToLectureRepository.save(createdUserAssignedToLecture);
    }


    private class UserDoesNotExistExeption {
        public UserDoesNotExistExeption(String użytkownik_nie_istnieje) {
        }
    }
}
