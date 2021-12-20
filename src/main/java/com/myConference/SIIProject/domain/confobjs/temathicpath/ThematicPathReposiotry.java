package com.myConference.SIIProject.domain.confobjs.temathicpath;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ThematicPathReposiotry extends JpaRepository<ThematicPath, UUID> {
}
