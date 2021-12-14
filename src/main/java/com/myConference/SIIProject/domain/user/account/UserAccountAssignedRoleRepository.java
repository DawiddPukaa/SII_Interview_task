package com.myConference.SIIProject.domain.user.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserAccountAssignedRoleRepository extends JpaRepository<UserAccountAssignedRole, UUID> {
}
