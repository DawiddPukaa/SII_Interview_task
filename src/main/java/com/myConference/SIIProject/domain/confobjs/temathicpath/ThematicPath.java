package com.myConference.SIIProject.domain.confobjs.temathicpath;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;

import java.util.List;



public class ThematicPath {

    public ThematicPath(List<Lecture> lecturesInThePath) {
        this.lecturesInThePath = lecturesInThePath;
    }

    public ThematicPath(String nameOfThematicPath, int thematicPathid, List<Lecture> lecturesInThePath) {
        this.nameOfThematicPath = nameOfThematicPath;
        this.thematicPathid = thematicPathid;
        this.lecturesInThePath = lecturesInThePath;
    }

    private String nameOfThematicPath;
    private int thematicPathid;
    List<Lecture> lecturesInThePath;


    public List<ThematicPath> makeThematicPath() {
        return null;
    }
}
