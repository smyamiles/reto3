package com.example.tutoriareto3.repository.crudRepository;


import com.example.tutoriareto3.entities.Message;
import com.example.tutoriareto3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

}
