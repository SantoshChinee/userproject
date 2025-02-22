package com.UserProject.TestProject.repository;

import com.UserProject.TestProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByRole(String role);
    List<User> findAllByOrderByAgeAsc();
    List<User> findAllByOrderByAgeDesc();
    Optional<User> findBySsn(String ssn);
}
