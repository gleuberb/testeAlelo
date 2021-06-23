package com.example.carros.domain;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
	public List<Carro> getCarros(){
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro(1L,"Fusca","Classico"));
		carros.add(new Carro(2L,"Chevete","Classico"));
		carros.add(new Carro(3L,"Mustang","Luxo"));
		carros.add(new Carro(4L,"RX8","Esportivo"));
		carros.add(new Carro(5L,"Porsche Cayene","Esportivo"));
		carros.add(new Carro(6L,"A3","Esportivo"));
		carros.add(new Carro(7L,"Celta","Classico"));
		carros.add(new Carro(8L,"HB20","Classico"));
		carros.add(new Carro(9L,"Camaro","Luxo"));
		carros.add(new Carro(10L,"Lamborghini","Luxo"));
		
		return carros;
	}

}