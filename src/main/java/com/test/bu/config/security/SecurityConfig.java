
package com.test.bu.config.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.test.bu.config")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Kevin").password("1111").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("admin").password("2222").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password("3333").roles("USER");
        auth.inMemoryAuthentication().withUser("user2").password("3333").roles("USER");

    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()

                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/user/users","/wallet/wallets").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/wallet/wallets").access("hasRole('ROLE_USER')")
                .and().formLogin()
                .and().exceptionHandling().accessDeniedPage("/error_page");

        /*    <------------   22:05 15/10/17   ----------------->    */
        /* http
                .csrf().disable()

                .authorizeRequests()
                .antMatchers("/", "/newUser").permitAll()
                .antMatchers("/**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/wallet/**").access("hasRole('ROLE_USER') or hasRole('ROLE-ADMIN')")
                .and().formLogin()
                .and().exceptionHandling().accessDeniedPage("/error_page");*/
    }
}
/*<-------------------------- OLD ---------------------------->*/

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.test.bu.config")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .usersByUsernameQuery("SELECT name,password FROM users WHERE name = ?")
                .authoritiesByUsernameQuery("SELECT name, role FROM roles WHERE name = ?")
                .dataSource(dataSource);
        auth.inMemoryAuthentication().withUser("admin").password("root").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/user/users").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/wallets").access("hasRole('ROLE_USER')").and().formLogin()
                .loginPage("/loginPage").permitAll()
                .usernameParameter("name")
                .passwordParameter("password")
                .and().exceptionHandling().accessDeniedPage("/error_page");
    }
}*//*




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
                .and()
                .logout()
                .permitAll();
    }
}
*/
