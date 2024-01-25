package com.busbookingwebapp.repositories;

import com.busbookingwebapp.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
