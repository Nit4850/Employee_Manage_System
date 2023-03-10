package com.fullstack.ems1backend.repository;

import com.fullstack.ems1backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
