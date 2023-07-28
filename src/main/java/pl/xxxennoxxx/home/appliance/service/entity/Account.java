package pl.xxxennoxxx.home.appliance.service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Set;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "username"))
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Account {

    @Id
    private Long id;

    private String username;
    private String password;
    private Boolean isActive;

    @ElementCollection
    @Enumerated(value = EnumType.STRING)
    private Set<UserRole> userRoles;
}