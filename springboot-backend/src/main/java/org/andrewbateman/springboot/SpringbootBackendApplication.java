package org.andrewbateman.springboot;

import org.andrewbateman.springboot.model.User;
import org.andrewbateman.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Bob", "Tweek", "bob@test.com"));
		this.userRepository.save(new User("Tom", "Peek", "tom@test.com"));
		this.userRepository.save(new User("Elvis", "Costelo", "elvis@test.com"));
	}

}
