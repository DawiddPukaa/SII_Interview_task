package com.myConference.SIIProject.domain.confobjs.lecture;

import javax.persistence.*;

public class Lecture {

    private String nameOfLecture;
    private int lectureLayer;
    private int lectureId;
    private int numberOfUsers;

    public Lecture(String nameOfLecture, int lectureLayer,int lectureId) {
        this.nameOfLecture = nameOfLecture;
        this.lectureLayer = lectureLayer;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

}


