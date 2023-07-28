package pl.xxxennoxxx.home.appliance.service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.xxxennoxxx.home.appliance.service.repos.RepairReposiotory;


@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("internal/order")
public class RepairController {

    private final RepairReposiotory repairReposiotory;

    @GetMapping("all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String showAllOrders(Model model, Authentication authentication) {
        model.addAttribute("count", repairReposiotory.count());
        log.info("Get all orders invocation");
        log.info(authentication.toString());
        return "orders";
    }
}
