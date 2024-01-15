package com.jpahibernate.repositories;

import com.jpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
