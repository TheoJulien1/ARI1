package com.example.resaconcert.Repository;


import org.springframework.data.repository.CrudRepository;
import com.example.resaconcert.Entity.Concert;


public interface ConcertRepository extends CrudRepository<Concert, Long>{

}
