package com.myConference.SIIProject.domain.confobjs.conference;

import com.myConference.SIIProject.domain.confobjs.temathicpath.CreateThematicPath;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

//klasa odpowiadająca odbieranemu JSON'owi gdyby nie była  w kodzie
//normlamnie nie byłoby tutaj listy
@AllArgsConstructor
@Getter
@ToString
public class CreateConferencePanelCommand {

    String nameOfConference;
    String describeOfConference;
    List<CreateThematicPath> thematicPathList;

}
