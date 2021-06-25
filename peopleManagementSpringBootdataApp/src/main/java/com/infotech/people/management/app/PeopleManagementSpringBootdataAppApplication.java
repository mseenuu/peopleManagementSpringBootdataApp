package com.infotech.people.management.app;


import com.infotech.people.management.app.entities.Person;
import com.infotech.people.management.app.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
//public class PeopleManagementSpringBootdataAppApplication implements CommandLineRunner {
	public class PeopleManagementSpringBootdataAppApplication  {


	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootdataAppApplication.class, args);
	}

}
