package com.example.resaconcert.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resaconcert.Entity.Concert;
import com.example.resaconcert.Repository.ConcertRepository;

@RestController
public class ConcertController {
	
	@Autowired
	ConcertRepository cr;
	
	@GetMapping(
		value = "/concert",
		produces = "application/json"
	)
	Iterable<Concert> concert() {
		return cr.findAll();
	}
	
}
