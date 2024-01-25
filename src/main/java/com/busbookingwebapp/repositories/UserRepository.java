package com.busbookingwebapp.repositories;

import com.busbookingwebapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
