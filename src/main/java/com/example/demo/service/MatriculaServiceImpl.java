package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	// inyectamos del service
	@Autowired
	// Qualifier
	@Qualifier("automatico")
	private IVehiculoValorMatricula vehiculoValorMatricula;

	@Override
	public void añadir(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void crearMatricula(String identificacion, String placa) {
		// TODO Auto-generated method stub
		// realizamos la matricula a partir de la identificaon y la placa

		// 1.busco el propietario
		Propietario prop = this.propietarioRepository.buscar(identificacion);
		// 2.busco el vehiculo
		Vehiculo vehi = this.vehiculoRepository.buscar(placa);

		// 3.Calculamos el valor de la matricula, para esto utilizamos
		// la clase gestora y los Qualifiers
		BigDecimal valorMatriculaTotal = this.vehiculoValorMatricula.CalcularValorMatricula(vehi.getPrecio());

		// 4.Creamos la matricula
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(prop);
		matricula.setValor(valorMatriculaTotal);
		matricula.setVehiculo(vehi);
		// 5.Insertamos la matricula en la base de datos

		this.matriculaRepository.insertar(matricula);
	}

}
