package com.example.demo.internacjonalizacja;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config  {

    @Bean
    public MessageSource messageSource( ) {

        ReloadableResourceBundleMessageSource rRBMS = new ReloadableResourceBundleMessageSource();
        rRBMS.setBasename("classpath:i18n/messages");
        rRBMS.setDefaultEncoding("UTF-8");
        return rRBMS;
    }

}
