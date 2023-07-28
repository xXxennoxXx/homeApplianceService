package pl.xxxennoxxx.home.appliance.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
}
