package com.example.demo.repository;

import com.example.demo.model.Consultadd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultaddRepository extends JpaRepository<Consultadd, Long> {

}
