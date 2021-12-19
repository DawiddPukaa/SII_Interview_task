package com.myConference.SIIProject.domain.confobjs.conference;

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

public class ConferencePanel {

    @Id
    @GeneratedValue
    UUID id;

    String nameOfConference;
    String describeOfConference;

    @OneToMany(cascade = {}, fetch = FetchType.LAZY)
    List<ThematicPath> thematicPathList;

    @Version
    Long version;
}
