package br.com.fiap.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LibraryFiapApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryFiapApplication.class, args);
	}

}
