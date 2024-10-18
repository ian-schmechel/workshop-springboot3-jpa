package com.ian.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.course.entities.OrderItem;
import com.ian.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
