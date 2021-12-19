package com.myConference.SIIProject.domain.confobjs.userAssignedToLecture;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssignUserToLectureRepository extends JpaRepository<UserAssignedToLecture, UUID> {
}
