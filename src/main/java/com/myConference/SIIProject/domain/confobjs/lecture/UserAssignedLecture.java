package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserAssignedLecture {

    @Id
    @GeneratedValue
    UUID id;

    @OneToOne(cascade = {}, fetch = FetchType.LAZY)
    UserAccount userAccount;

    @OneToMany(cascade = {}, fetch = FetchType.LAZY)
    List<Lecture> usersLectures;

    @Version
    Long version;
}
