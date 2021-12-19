package com.myConference.SIIProject.domain.confobjs.temathicpath;

import com.myConference.SIIProject.domain.confobjs.lecture.CreateLectureCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

//klasa odpowiadająca odbieranemu JSON'owi gdyby konferencja nie była w kodzie. Została delikatnie zmodyfikowana na potrzeby utworzenia w testach konferencji wraz z ścieżkami tematycznymi i prelekcjami. Jeżeli klasa zopstała w takim stanie to znaczy, że nie wsytarczyło mi czasu na zaimplementowanie serwisu iteraktywnego z użytkownikiem na froncie
@AllArgsConstructor
@Getter
@ToString
public class CreateThematicPath {

    String nameOfThematicPath;
    String describeOfThematicPath;
    int idOfThematicPath;
    List<CreateLectureCommand> lecturesInThePath;
}
