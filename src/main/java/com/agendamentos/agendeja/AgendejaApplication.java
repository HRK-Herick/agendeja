package com.agendamentos.agendeja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendejaApplication {

	public static void main(String[] args) {

        SpringApplication.run(AgendejaApplication.class, args);

        System.out.println("Servidor respondendo da porta 1433");
    }
}
