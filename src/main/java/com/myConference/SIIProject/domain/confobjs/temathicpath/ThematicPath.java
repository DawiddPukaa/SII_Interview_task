package com.myConference.SIIProject.domain.confobjs.temathicpath;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "lecturesInThePath")
@ToString(exclude = "lecturesInThePath")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThematicPath {
    @Id
    @GeneratedValue
    UUID id;

    private String nameOfThematicPath;

    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    List<Lecture> lecturesInThePath;

    @Version
    Long version;
}
