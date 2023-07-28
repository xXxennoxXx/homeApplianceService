package pl.xxxennoxxx.home.appliance.service.order.output;

public interface OrderFacade {
    OrderStatus checkStatus(String phone, String email, String orderNumber);
}
