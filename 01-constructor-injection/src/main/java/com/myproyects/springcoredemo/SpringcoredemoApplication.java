package com.myproyects.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication .- Solamente lee del paquete springcoredemo hacia abajo.
@SpringBootApplication(
		scanBasePackages={"com.myproyects.demo.utils"})//aqui le dices que tambien lea demo.utils
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
