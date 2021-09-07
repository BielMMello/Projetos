package com.mello.aulaDomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mello.aulaDomain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
