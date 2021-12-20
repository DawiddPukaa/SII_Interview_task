package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = {"userAccounts","thematicPath"})
@ToString(exclude = {"userAccounts","thematicPath"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lecture {

    @Id
    @GeneratedValue
    Integer id;

    private String nameOfLecture;
    private int lectureLayer;

    /*@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    ThematicPath thematicPath;*/

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "user_lecture",
            joinColumns = @JoinColumn(name = "lecture_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    Set<UserAccount> userAccounts;

    @Version
    Long version;
}


