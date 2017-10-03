package com.test.bu.config;


import com.test.bu.dao.UsersDao;
import com.test.bu.dao.UsersDaoImp;
import com.test.bu.dao.WalletDao;
import com.test.bu.dao.WalletDaoIml;
import com.test.bu.service.UsersService;
import com.test.bu.service.UsersServiceImpl;
import com.test.bu.service.WalletService;
import com.test.bu.service.WalletServiceImpl;
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

}
