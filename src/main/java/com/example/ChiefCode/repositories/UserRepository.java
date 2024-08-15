package com.example.ChiefCode.repositories;

import com.example.ChiefCode.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
