package com.course.spring.repositories;

import com.course.spring.entities.Order;
import com.course.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
