package com.myConference.SIIProject.domain.confobjs.temathicpath;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ThematicPath {
    @Id
    Long id;
}
