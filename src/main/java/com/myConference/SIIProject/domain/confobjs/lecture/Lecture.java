package com.myConference.SIIProject.domain.confobjs.lecture;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
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

        @Lob
        String content;

        Instant postedOn;

        @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
        UserAccount postedBy;

        @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
        ThematicPath onWchihThemiaticPath;

        @Version
        Long version;
    }


