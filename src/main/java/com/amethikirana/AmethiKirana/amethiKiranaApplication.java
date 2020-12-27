package com.amethikirana.AmethiKirana;

import com.amethikirana.AmethiKirana.User.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class amethiKiranaApplication {

	public static void main(String[] args) {
		SpringApplication.run(amethiKiranaApplication.class, args);
	}

}
