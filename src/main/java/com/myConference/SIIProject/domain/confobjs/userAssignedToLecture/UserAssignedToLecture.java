package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import com.myConference.SIIProject.domain.user.account.UserAccountRole;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "lectures")
@ToString(exclude = "lectures")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserAssignedToLecture {
    @Id
    @GeneratedValue
    UUID id;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    UserAccount userAccount;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    List<Lecture> lectures;

    @Version
    Long version;
}
