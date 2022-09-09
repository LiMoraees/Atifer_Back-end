package com.atifer.atifer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.atifer.atifer.repository.OrcamentoRepository;

@SpringBootApplication
public class AtiferApplication {

	public static void main(String[] args) {
		OrcamentoRepository.init();
		SpringApplication.run(AtiferApplication.class, args);
	}

}
