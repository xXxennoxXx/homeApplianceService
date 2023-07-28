package pl.xxxennoxxx.home.appliance.service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("api/check")
public class CheckController {

    @GetMapping("order")
//    @PreAuthorize("hasRole('ADMIN')")
    public String checkOrder(
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String orderNumber,
            Model model,
            Authentication authentication) {
//        log.info(authentication.toString());
        model.addAttribute("request", Boolean.FALSE);
        model.addAttribute("response", Response.builder()
                .orderStatus("w realizacji")
                .orderNumber(orderNumber)
                .build());
        return "checkOrder";
    }

    @GetMapping("repair")
    public String checkRepair() {
        return "checkRepair";
    }
}
