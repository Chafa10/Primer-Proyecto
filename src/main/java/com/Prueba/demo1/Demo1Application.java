package com.Prueba.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.Arrays;



@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);

		System.out.println("===============================================================");
		System.out.println("===============================================================");
		System.out.println("=================***********INICIO*********====================");
		TraigoDatos.ExtraccionDeDatos();




	}

		/*@Bean
		public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
			return args -> {
				System.out.println("Let´s inspect the beans provided by Spring Boot:");

				String[] beanNames = ctx.getBeanDefinitionNames();
				Arrays.sort(beanNames);

				for (String beanName : beanNames) {
					System.out.println(beanName);
				}
			};
		}*/
	}





