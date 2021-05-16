package com.shivam.codingchellenge.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.codingchellenge.Entity.CPU;
import com.shivam.codingchellenge.Entity.Computer;
import com.shivam.codingchellenge.repo.CPURepo;
import com.shivam.codingchellenge.repo.ComputerRepo;
@RestController
public class ComputerController {
	@Autowired
	ComputerRepo cr;
	@Autowired
	CPURepo cpr;

	@PostMapping("/computer")
	Computer addLaptop(@RequestBody Computer computer) {
		return cr.save(computer);

	}
	@GetMapping("/computer")
	List<Computer> showComputers()
	{
		return cr.findAll();
		
	}
	@GetMapping("/computer/{id}")
	Computer sowComputer(@PathVariable long id)
	{
		
	   Computer computer=cr.findById(id).get();
	   System.out.println(computer.getcPU());
	   return computer;
	}
	@GetMapping("/cpu")
	List<CPU> showCPU()
	{
		return cpr.findAll();
	
		
	}
	
	@PostMapping("/cpu")
	CPU addCpu(@RequestBody CPU cpu)
	{
		System.out.println("Hii i am in cpu");
		return cpr.save(cpu);
	}
}
