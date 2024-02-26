package com.oj.mysite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception {
        // 开启授权保护
//        http.authorizeRequests(authorize -> authorize
//                .requestMatchers("/static/**").permitAll()
//                .anyRequest().authenticated()
//        );
//        // 开启表单登录
//        http.formLogin(form -> {
//            form
//                    .loginPage("/login")
//                    .permitAll()
//                    .successHandler(new MyAuthenticationSuccessHandler())
//                    .failureHandler(new MyAuthenticationFailureHandler());
//        });
//        http.logout(logout -> {
//            logout
//                    .logoutSuccessHandler(new MyLogoutSuccessHandler());
//        });
//
//        http.sessionManagement(session ->{
//            session
//                    .maximumSessions(1)
//                    .expiredSessionStrategy(new MySessionInformationExpiredStrategy());
//        });

        return http.build();
    }

}
