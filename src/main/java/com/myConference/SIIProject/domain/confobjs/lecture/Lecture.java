package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.user.account.UserAccount;

import java.util.Set;

public class Lecture {

    public Lecture(String nameOfLecture, int idConference) {
        this.nameOfLecture = nameOfLecture;
        this.idConference = idConference;
    }

    private String nameOfLecture;
    private int idConference;
    Set<UserAccount> usersJoinedLecture;

}


