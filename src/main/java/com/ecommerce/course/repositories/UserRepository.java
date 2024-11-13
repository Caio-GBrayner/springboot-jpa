package com.ecommerce.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	

}
