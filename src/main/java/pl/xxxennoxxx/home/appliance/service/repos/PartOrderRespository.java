package pl.xxxennoxxx.home.appliance.service.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.xxxennoxxx.home.appliance.service.entity.PartOrder;

public interface PartOrderRespository extends JpaRepository<PartOrder, Long> {
}
