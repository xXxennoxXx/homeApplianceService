package pl.xxxennoxxx.home.appliance.service.order.repair;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("internal/order/repair")
@RequiredArgsConstructor
public class RepairOrderController {

    @GetMapping("add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String addNewRepairOrder() {
        return "internal/addOrder";
    }
}
