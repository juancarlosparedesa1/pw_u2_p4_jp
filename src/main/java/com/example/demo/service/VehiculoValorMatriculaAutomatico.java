package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class VehiculoValorMatriculaAutomatico implements IVehiculoValorMatricula {

	@Override
	public BigDecimal CalcularValorMatricula(BigDecimal precio) {
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.15));
		BigDecimal valor = new BigDecimal(3000);
		if (valorMatricula.compareTo(valor) > 0) {// 1 a>b 0 a=b -1 b>a
			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(new BigDecimal(0.09)));
		}
		return valorMatricula;
	}

	
		
}
