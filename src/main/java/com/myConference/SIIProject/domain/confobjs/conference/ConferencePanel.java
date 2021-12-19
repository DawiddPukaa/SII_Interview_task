package com.myConference.SIIProject.domain.confobjs.conference;

import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import java.util.List;
import java.util.UUID;


public class ConferencePanel {

    UUID id;

    String nameOfConference;
    String describeOfConference;

    List<ThematicPath> thematicPathList;

}
