package org.maatalla.dao;

import org.maatalla.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
 
}
