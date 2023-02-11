package br.com.fiap.cors.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cors.models.Carro;

@RestController
@RequestMapping("/carros")
public class CorsController {
	
	
	@GetMapping("/listar")
	@CrossOrigin(maxAge = 3600)
	public List<Carro> listar () {
		
		List<Carro> carros = gerarListaCarros();
		return carros;
	}

	private List<Carro> gerarListaCarros() {
		Carro ferrari = new Carro("Ferrari 458", "Ferrari");
		Carro uno = new Carro("Uno Fire", "Fiat");
		Carro jeep = new Carro("Compass", "Jeep");
		List<Carro> carros = new ArrayList<>();
		carros.add(ferrari);
		carros.add(uno);
		carros.add(jeep);
		return carros;
	}
	
	@GetMapping("/listar/semcors")
	private List<Carro> gerarListaCarrosSemCors() {
		Carro ferrari = new Carro("Ferrari 458", "Ferrari");
		Carro uno = new Carro("Uno Fire", "Fiat");
		Carro jeep = new Carro("Compass", "Jeep");
		List<Carro> carros = new ArrayList<>();
		carros.add(ferrari);
		carros.add(uno);
		carros.add(jeep);
		return carros;
	}
}
