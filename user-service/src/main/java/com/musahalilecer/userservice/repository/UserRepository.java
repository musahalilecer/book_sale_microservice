package com.musahalilecer.userservice.repository;

import com.musahalilecer.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
