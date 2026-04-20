package com.virtualtrader.backend.repository;

import com.virtualtrader.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user by their username.
     * Spring Data JPA automatically creates the query for this method based on its name.
     *
     * @param username The username to search for.
     * @return An Optional containing the user if found, otherwise an empty Optional.
     */
    Optional<User> findByUsername(String username);
}