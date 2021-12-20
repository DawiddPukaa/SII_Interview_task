package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = "lectures")
@ToString(exclude = "lectures")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAssignedToLecture {
    UserAccount userAccount;
    Lecture lectures;
}
