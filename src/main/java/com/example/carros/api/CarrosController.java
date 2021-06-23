package com.example.carros.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
	private CarroService service = new CarroService();
	
	@GetMapping()
	public List<Carro> get(){
		return service.getCarros();
	}
	@PostMapping()
	public List<Carro> post(){
		return service.getCarros();
	}
	@PutMapping()
	public List<Carro> put(){
		return service.getCarros();
	}
	@DeleteMapping()
	public List<Carro> delete(){
		return service.getCarros();
	}
}
