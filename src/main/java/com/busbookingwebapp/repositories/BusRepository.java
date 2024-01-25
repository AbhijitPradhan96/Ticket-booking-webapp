package com.busbookingwebapp.repositories;

import com.busbookingwebapp.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
