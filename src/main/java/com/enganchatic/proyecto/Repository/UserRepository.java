package com.enganchatic.proyecto.Repository;

import com.enganchatic.proyecto.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
