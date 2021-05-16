package com.shivam.codingchellenge.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.codingchellenge.Entity.Computer;

public interface ComputerRepo extends JpaRepository<Computer, Long> {

}
