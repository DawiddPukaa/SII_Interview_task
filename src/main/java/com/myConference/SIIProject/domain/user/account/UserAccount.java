package com.myConference.SIIProject.domain.user.account;

import
        lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode(exclude = "roles")
@ToString(exclude = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
    indexes = @Index(columnList = "username", unique = true)
)
public class UserAccount {
    @Id
    @GeneratedValue
    UUID id;

    String name;
    String secondName;
    String username;
    String password;
    Instant registeredAt;
    Boolean isExpired;
    Boolean isAccountLocked;
    Boolean isCredentialsExpired;
    Boolean isEnabled;

    @OneToMany(mappedBy = "userAccount", fetch = FetchType.EAGER)
     Set<UserAccountAssignedRole> roles;

    @Version
    Long version;
}

