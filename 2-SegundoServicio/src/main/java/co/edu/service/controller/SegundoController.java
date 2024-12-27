package co.edu.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegundoController {
	
	@GetMapping(value="sumar/{num1}/{num2}")
	public double suma(@PathVariable("num1") double num1,
			@PathVariable("num2") double num2) {
		return num1 + num2;
	}
	
	@GetMapping(value="restar/{num1}/{num2}")
	public double resta(@PathVariable("num1") double num1,
			@PathVariable("num2") double num2) {
		return num1 - num2;
	}
	
	@GetMapping(value="multiplicar/{num1}/{num2}")
	public double multiplicacion(@PathVariable("num1") double num1,
			@PathVariable("num2") double num2) {
		return num1 * num2;
	}
	
	@GetMapping(value="dividir/{num1}/{num2}")
	public double division(@PathVariable("num1") double num1,
			@PathVariable("num2") double num2) {
		return num1 / num2;
	}
	
	@GetMapping(value = "potenciar/{base}/{exponente}")
	public double potenciacion(
	        @PathVariable("base") double base1,
	        @PathVariable("exponente") double exponente1) {
	    double resultado = Math.pow(base1, exponente1);
	    return resultado;
	}

}

