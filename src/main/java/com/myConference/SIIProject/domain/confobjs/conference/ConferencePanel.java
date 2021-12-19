package com.myConference.SIIProject.domain.confobjs.conference;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ConferencePanel {

    String nameOfConference;

    List<ThematicPath> thematicPathList;

}
