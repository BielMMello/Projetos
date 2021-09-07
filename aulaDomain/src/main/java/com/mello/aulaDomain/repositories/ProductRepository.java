package com.mello.aulaDomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mello.aulaDomain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
