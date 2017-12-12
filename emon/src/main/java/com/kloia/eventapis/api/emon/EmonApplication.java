package com.kloia.eventapis.api.emon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by mali on 20/01/2017.
 */
@Slf4j
@SpringBootApplication
//@ComponentScan(basePackages = {"com.kloia.eventapis.api.store","com.kloia.eventbus"})

public class EmonApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EmonApplication.class, args);

    }





}