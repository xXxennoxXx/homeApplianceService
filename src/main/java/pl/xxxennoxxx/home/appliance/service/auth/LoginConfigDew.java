package pl.xxxennoxxx.home.appliance.service.auth;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@ConditionalOnProperty(name = "app.dev", havingValue = "true", matchIfMissing = false)
public class LoginConfigDew {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests((requests) ->
                        requests
                                .requestMatchers(PathRequest.toH2Console()).permitAll()
                                .antMatchers("/internal/**").authenticated()
                                .anyRequest().permitAll())
                .formLogin()
                .defaultSuccessUrl("/internal/dashboard")
                .permitAll();
        http.headers().frameOptions().disable();
        http.csrf(csrf -> csrf.ignoringRequestMatchers(PathRequest.toH2Console()));
        return http.build();
    }
}
