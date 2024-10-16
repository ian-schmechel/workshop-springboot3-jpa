package com.ian.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
