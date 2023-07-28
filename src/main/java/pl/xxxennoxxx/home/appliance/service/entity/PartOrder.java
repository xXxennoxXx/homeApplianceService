package pl.xxxennoxxx.home.appliance.service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartOrder extends Order {

    @Enumerated(value = EnumType.STRING)
    private PartOrderStatus partOrderStatus;
}
