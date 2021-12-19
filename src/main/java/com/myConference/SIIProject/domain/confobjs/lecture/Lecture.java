package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.user.account.UserAccount;

import java.util.Set;

public class Lecture {

    String nameOfLecture;
    String describeOfLecture;

    Set<UserAccount> usersJoinedLecture;

    ThematicPath thematicPath;

}


