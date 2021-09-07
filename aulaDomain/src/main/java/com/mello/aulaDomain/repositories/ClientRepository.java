package com.mello.aulaDomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mello.aulaDomain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	
}
