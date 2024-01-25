package com.busbookingwebapp.repositories;

import com.busbookingwebapp.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
