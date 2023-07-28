package pl.xxxennoxxx.home.appliance.service.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.xxxennoxxx.home.appliance.service.order.output.OrderFacade;
import pl.xxxennoxxx.home.appliance.service.order.output.OrderStatus;

@Service
@RequiredArgsConstructor
@Slf4j
class OrderService implements OrderFacade {
    @Override
    public OrderStatus checkStatus(String phone, String email, String orderNumber) {
        return null;
    }
}
