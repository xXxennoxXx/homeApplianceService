package pl.xxxennoxxx.home.appliance.service.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.xxxennoxxx.home.appliance.service.entity.Account;

public interface UserRepo extends JpaRepository<Account, Long> {
}
