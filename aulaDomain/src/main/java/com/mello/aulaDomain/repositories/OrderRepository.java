package com.mello.aulaDomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mello.aulaDomain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
