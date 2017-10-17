package com.test.bu.config;


import com.test.bu.dao.*;
import com.test.bu.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public WalletService getWalletService() {
        return new WalletServiceImpl();
    }

    @Bean
    public WalletDao getWalletDao() {
        return new WalletDaoIml();
    }

    @Bean
    public UsersService getUsersService() {
        return new UsersServiceImpl();
    }

    @Bean
    public UsersDao getUsersDao() {
        return new UsersDaoImp();
    }

    @Bean
    public RoleService getRoleService() {
        return new RoleServiceImpl();}

    @Bean
    public RoleDao getRoleDao() { return new RoleDaoImpl();}
}
