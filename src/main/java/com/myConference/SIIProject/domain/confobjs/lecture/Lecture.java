package com.myConference.SIIProject.domain.confobjs.lecture;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "lectures")
@ToString(exclude = "lectures")
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Lecture {

    @Id
    private int lectureId;

    private String nameOfLecture;
    private int lectureLayer;
    private int numberOfUsers;
    UUID usernameId;

    public Lecture(String nameOfLecture, int lectureLayer,int lectureId) {
        this.nameOfLecture = nameOfLecture;
        this.lectureLayer = lectureLayer;
        this.lectureId = lectureId;
    }

    @Version
    Long version;
}


