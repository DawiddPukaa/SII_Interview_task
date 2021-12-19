package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "lecturesAssignedToUser")
@ToString(exclude = "lecturesAssignedToUser")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserAssignedToLecture {
    @Id
    @GeneratedValue
    UUID id;

//    List<Integer> lecturesAssignedToUser;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    UserAccount userAccount;

    @Version
    Long version;
}
