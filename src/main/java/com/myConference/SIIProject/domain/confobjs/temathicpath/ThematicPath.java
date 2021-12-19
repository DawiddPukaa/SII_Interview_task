package com.myConference.SIIProject.domain.confobjs.temathicpath;

import com.myConference.SIIProject.domain.confobjs.conference.ConferencePanel;
import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;

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

public class ThematicPath {

    @Id
    @GeneratedValue
    UUID id;

    String nameOfThematicPath;
    String describeOfThematicPath;


    @OneToMany(cascade = {}, fetch = FetchType.LAZY)
    List<Lecture> lecturesInThePath;

    @ManyToOne(cascade = {}, fetch = FetchType.LAZY)
    ConferencePanel conferencePanel;

    @Version
    Long version;
}
