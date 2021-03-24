package com.stackroute.sbservice.repository;

import com.stackroute.sbservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * This class is implementing the JpaRepository interface for Person.
 * Annotate this class with @Repository annotation
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
