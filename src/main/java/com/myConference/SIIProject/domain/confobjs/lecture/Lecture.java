package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {

    @Id
    @GeneratedValue
    UUID id;


    String nameOfLecture;
    @Lob
    String describeOfLecpture;

    //Instant postedOn;

    @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    Set<UserAccount> usersJoinedLecture;

    @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    ThematicPath thematicPath;

    @Version
    Long version;
}


