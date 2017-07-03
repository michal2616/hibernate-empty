package com.gwiazda;

import com.gwiazda.model.Person;
import com.gwiazda.repository.PersonRepository;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class HibernateEmptyApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateEmptyApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		personRepository.deleteAll();
		System.out.println("egee");
		Person firtPerson = new Person("Michal", "Gwiazda");
		Person secondPerson = new Person("Antoni", "M");

		personRepository.save(firtPerson);
		personRepository.save(secondPerson);

		List<Person> allPeople = personRepository.findAll();
		System.out.println(allPeople.get(0).getLastName());
	}
}
