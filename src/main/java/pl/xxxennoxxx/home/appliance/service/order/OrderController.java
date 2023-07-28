package pl.xxxennoxxx.home.appliance.service.order;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("orders")
@Slf4j
@RequiredArgsConstructor
class OrderController {

    @GetMapping("all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String showAllOrders(Model model, Authentication authentication) {
        log.info("Get all orders invocation");
        return "orders";
    }

    @PostMapping("add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String addOrder(Model model, Authentication authentication) {
        log.info("Get all orders invocation");
        return "addOrder";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public String addOrder(Request request, Model model, Authentication authentication) {
        log.info("Get all orders invocation");
        log.info("Request body: {}", request);
        return "orders";
    }

    @Value
    static class Request {
        String number;
        String desc;
    }
}
