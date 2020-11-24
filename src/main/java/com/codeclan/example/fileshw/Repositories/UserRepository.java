package com.codeclan.example.fileshw.Repositories;

import com.codeclan.example.fileshw.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
