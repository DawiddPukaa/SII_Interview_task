package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import com.myConference.SIIProject.domain.confobjs.lecture.LectureRepository;
import com.myConference.SIIProject.domain.user.CurrentUserProvider;
import com.myConference.SIIProject.domain.user.account.UserAccount;

import com.myConference.SIIProject.domain.user.account.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Set;

@AllArgsConstructor
@Component
public class AssignUserToLectureCreator {

    private final CurrentUserProvider currentUserProvider;
    private final LectureRepository lectureRepository;
    private final UserAccountRepository userAccountRepository;

    @Transactional
    public UserAssignedToLecture create(CreateAssignUserToLectureCommand command) {

        UserAccount currentUser =
                userAccountRepository.findById(currentUserProvider.getCurrentUser().getId()).orElseThrow();

        Lecture lecture = lectureRepository.findById(command.lectureId).orElseThrow(RuntimeException::new);// własny wyjątek
        int size = lecture.getUserAccounts().size(); // w lecture musi być metoda addParticipantIfPossible
        if (size >= 5) {
            throw new RuntimeException("Nie można dodać/ Full miejsc zajete");// własny wyjątek
        }
        Set<Lecture> lectures = currentUser.getLectures();
        boolean sadas = lectures.stream()
                .anyMatch(x -> x.getLectureLayer() == lecture.getLectureLayer());
        if (sadas){
            throw new RuntimeException("");// własny wyjątek
        }

        lecture.getUserAccounts().add(currentUser);
        Lecture saved = lectureRepository.save(lecture);
        return UserAssignedToLecture.builder().userAccount(currentUser).lectures(saved).build();
    }
}
