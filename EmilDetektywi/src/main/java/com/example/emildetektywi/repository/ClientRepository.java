package com.example.emildetektywi.repository;

import com.example.emildetektywi.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
