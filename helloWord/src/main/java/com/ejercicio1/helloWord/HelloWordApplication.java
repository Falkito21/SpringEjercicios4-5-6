package com.ejercicio1.helloWord;

import com.ejercicio1.helloWord.entities.Laptop;
import com.ejercicio1.helloWord.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class HelloWordApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(HelloWordApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "lenovo", 15, 105.200, LocalDate.of(2019, 05, 10));
		Laptop laptop2 = new Laptop(null, "acer", 14, 90.500, LocalDate.of(2018, 07, 21));

		repository.save(laptop1);
		repository.save(laptop2);
	}

}
