package com.myConference.SIIProject;

import com.myConference.SIIProject.domain.confobjs.conference.ConferencePanel;
import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SiiProjectApplication {
    private static final List<String> namesOfLectures = List.of(new String[]{"Java", "C++", ".NET"});

    public static void main(String[] args) {

        //1.

        ConferencePanel conferencePanel = createConferece(createThematicspath(namesOfLectures));

        //2.

        //zapisy użytkowników na prelekcje do bazy

        //3.


    }

    private static List<ThematicPath> createThematicspath(List<String> namesOfLecture) {
        List<Lecture> tmplectures = new ArrayList<>();
        List<ThematicPath> thematicPathList = new ArrayList<>();
        for (int i = 0; i < namesOfLecture.size(); i++) {
            for (int j = 0; j < 3; j++) {
                int v = j + 1;
                Lecture lecture = new Lecture(namesOfLecture.get(i) + " " + v, j + 1,j);
                tmplectures.add(lecture);
            }
            List<Lecture> lectures = new ArrayList<>(tmplectures);
            thematicPathList.add(new ThematicPath(namesOfLecture.get(i), i + 1, lectures));
            tmplectures.clear();
        }
        return thematicPathList;
    }

    private static ConferencePanel createConferece(List<ThematicPath> thematicPathList) {
        return new ConferencePanel("MyOwnConference", thematicPathList);
    }

}
