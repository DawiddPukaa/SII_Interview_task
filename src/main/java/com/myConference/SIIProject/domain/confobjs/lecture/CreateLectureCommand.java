package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Set;


//klasa odpowiadająca odbieranemu JSON'owi gdyby konferencja nie była w kodzie. Została delikatnie zmodyfikowana na potrzeby utworzenia w testach konferencji wraz z ścieżkami tematycznymi i prelekcjami. Jeżeli klasa zopstała w takim stanie to znaczy, że nie wsytarczyło mi czasu na zaimplementowanie serwisu iteraktywnego z użytkownikiem na froncie
@AllArgsConstructor
@Getter
@ToString
public class CreateLectureCommand {

    String nameOfLecture;
    String describeOfLecture;
    int idOfLecture;
    Set<UserAccount> usersAddedToLecture;

    public CreateLectureCommand(String nameOfLecture, String describeOfLecture, int idOfLecture) {
        this.nameOfLecture = nameOfLecture;
        this.describeOfLecture = describeOfLecture;
        this.idOfLecture = idOfLecture;
    }
}
