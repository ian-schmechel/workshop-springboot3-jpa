package com.ian.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
