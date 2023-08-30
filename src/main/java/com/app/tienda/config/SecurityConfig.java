package com.app.tienda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()  // Desactivar CSRF para H2-console
            .headers().frameOptions().disable() // Permitir iframes para H2-console
            .and()
            .authorizeRequests()
                .antMatchers("/h2-console/**").permitAll() // Permitir todos los accesos a /h2-console
                .anyRequest().authenticated()  // Cualquier otra solicitud necesita autenticación
            .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
            .and()
            .logout()
                .permitAll();
    }
}