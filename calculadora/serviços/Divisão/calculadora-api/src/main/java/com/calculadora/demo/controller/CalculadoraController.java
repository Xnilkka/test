package com.calculadora.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.demo.model.Numeros;
import com.calculadora.demo.model.Result;


@RestController
@RequestMapping("/api/calculator")
public class CalculadoraController {
	
	Numeros numeros = new Numeros();
	
	@PostMapping("/divide")
	public Result soma(@RequestBody Numeros numeros) {
		int resultado = numeros.resultdivide();
		Result resultadoSoma = new Result();
		resultadoSoma.setresult(resultado);
		return resultadoSoma;
	}
}


