package com.myproyects.springcoredemo.config;

import com.myproyects.springcoredemo.common.Coach;
import com.myproyects.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("swim")
    public Coach swimCoach(){ //debe ser el mimo nombre de la clase con la primera letra minuscula en este caso hace referencia a la
                            //clase SwimCoach
        return new SwimCoach();
    }
}
