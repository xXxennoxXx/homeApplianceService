package pl.xxxennoxxx.home.appliance.service.controller.internal;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("internal")
@Controller
@RequiredArgsConstructor
class InternalController {

    @GetMapping("dashboard")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getInternalDashboard(Authentication authentication) {
        authentication.getPrincipal();
        return "internal/dashboard";

    }
}
