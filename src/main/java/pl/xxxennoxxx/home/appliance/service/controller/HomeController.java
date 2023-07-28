package pl.xxxennoxxx.home.appliance.service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.xxxennoxxx.home.appliance.service.repos.PartOrderRespository;
import pl.xxxennoxxx.home.appliance.service.repos.UserRepo;

import javax.annotation.security.PermitAll;

@Controller
@RequiredArgsConstructor
@Slf4j
@PermitAll
public class HomeController {

    private final PartOrderRespository partOrderRespository;
    private final UserRepo userRepo;

    @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("check/order")
    public String checkOrder(Model model) {
        model.addAttribute("request", Boolean.TRUE);
        return "checkOrder";
    }

    @GetMapping("check/repair")
    public String checkRepair() {
        return "checkRepair";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }
}
