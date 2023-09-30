package com.example.santanderdevwook2023.domain.repository;

import com.example.santanderdevwook2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
