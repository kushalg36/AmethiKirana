package com.amethikirana.AmethiKirana.Product.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"/product/**").hasAnyRole("SELLER","ADMIN")
                .antMatchers(HttpMethod.PUT, "/product/**").hasAnyRole("SELLER","ADMIN")
                .antMatchers(HttpMethod.DELETE,"/product/**").hasAnyRole("SELLER","ADMIN")
                .antMatchers(HttpMethod.GET,"/product/seller/**").hasAnyRole("SELLER","ADMIN");
    }
}
