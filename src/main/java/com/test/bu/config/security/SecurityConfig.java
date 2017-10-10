/*
package com.test.bu.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Kevin").password("1111").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("admin").password("2222").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password("3333").roles("USER");

    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http*/
/*.csrf().disable()*//*

                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/users").access("hasRole('ROLE_ADMIN')")
                .and().formLogin()
                .and().exceptionHandling().accessDeniedPage("/error_page");
    }
}

*/





/*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("ADMIN");
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                    .antMatchers("/").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/loginPage").permitAll()//.failureUrl("/error_page")
                    .permitAll()
                .and()
                .logout()
                .permitAll();
    }
}
*/
