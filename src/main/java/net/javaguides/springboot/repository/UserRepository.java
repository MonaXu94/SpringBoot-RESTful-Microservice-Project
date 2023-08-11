package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<User, Long> User is the type of entity your are passing
//Long is the type of primary key

public interface UserRepository extends JpaRepository<User, Long> {





}
