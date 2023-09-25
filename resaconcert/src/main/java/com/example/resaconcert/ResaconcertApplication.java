package com.example.resaconcert;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.resaconcert.Entity.Concert;
import com.example.resaconcert.Repository.ConcertRepository;

@SpringBootApplication
public class ResaconcertApplication {
	public static void main(String[] args) {
		SpringApplication.run(ResaconcertApplication.class, args);
	}
	
	@Bean
	 public CommandLineRunner demo(ConcertRepository cr) {
	    return (args) -> {
	    	cr.save(new Concert((long) 1,"PNL"));
	    	cr.save(new Concert((long) 2,"Travis scott"));
	    	cr.save(new Concert((long) 3,"Playboy Carti"));
	    	cr.save(new Concert((long) 4,"Sch"));
	    };
	}
}