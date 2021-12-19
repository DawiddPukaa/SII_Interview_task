package com.myConference.SIIProject;


import com.myConference.SIIProject.domain.confobjs.conference.CreateConferencePanelCommand;
import com.myConference.SIIProject.domain.confobjs.lecture.CreateLectureCommand;
import com.myConference.SIIProject.domain.confobjs.temathicpath.CreateThematicPath;

import java.util.List;

public class ConferenceTestClass {


    private static CreateConferencePanelCommand CreateConference() {

        return new CreateConferencePanelCommand("MyConference", "ExampleConference",
                List.of(
                        new CreateThematicPath("ThematicPathJava1",
                                "ThematicJavaPath1",
                                1,
                                List.of(
                                        new CreateLectureCommand("LectureJava1",
                                                "LectureJava1",
                                                1),
                                        new CreateLectureCommand("LectureJava2",
                                                "LectureJava2",
                                                2),
                                        new CreateLectureCommand("LectureJava3",
                                                "LectureJava3",
                                                3)
                                )),
                        new CreateThematicPath("ThematicPathC++2",
                                "ThematicPathC++2",
                                2,
                                List.of(
                                        new CreateLectureCommand("LectureC++1",
                                                "LectureC++1",
                                                1),
                                        new CreateLectureCommand("LectureC++2",
                                                "LectureC++2",
                                                2),
                                        new CreateLectureCommand("LectureC++3",
                                                "LectureC++3",
                                                3)
                                )),
                        new CreateThematicPath("ThematicPathPython3",
                                "ThematicPathPython3",
                                3,
                                List.of(
                                        new CreateLectureCommand("LecturePython1",
                                                "LecturePython1",
                                                1),
                                        new CreateLectureCommand("LecturePython2",
                                                "LecturePython2",
                                                2),
                                        new CreateLectureCommand("LecturePython3",
                                                "LecturePython3",
                                                3)
                                ))
                ));

    }
}
