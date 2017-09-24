package com.test.bu.config;


import com.test.bu.dao.GoodsDao;
import com.test.bu.dao.GoodsDaoImp;
import com.test.bu.dao.WalletDao;
import com.test.bu.dao.WalletDaoIml;
import com.test.bu.service.GoodsService;
import com.test.bu.service.GoodsServiceImpl;
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
    public GoodsService getGoodsService() {
        return new GoodsServiceImpl();
    }

    @Bean
    public GoodsDao getGoodsDao() {
        return new GoodsDaoImp();
    }

}
