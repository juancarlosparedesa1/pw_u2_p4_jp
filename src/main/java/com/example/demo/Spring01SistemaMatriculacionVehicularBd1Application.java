package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@SpringBootApplication
public class Spring01SistemaMatriculacionVehicularBd1Application implements CommandLineRunner {

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring01SistemaMatriculacionVehicularBd1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("Toyota");
		vehiculo1.setPlaca("abc-123");
		vehiculo1.setModelo("2020");
		vehiculo1.setPrecio(new BigDecimal(5000));
		vehiculo1.setTipo("a");
		this.vehiculoRepository.insertar(vehiculo1);
		vehiculo1.setPrecio(new BigDecimal(8000));
		vehiculo1.setModelo("2023");
		this.vehiculoRepository.actualizar(vehiculo1);

		Propietario propietario1 = new Propietario();
		propietario1.setApellido("paredes");
		propietario1.setFechaNacimiento(LocalDateTime.of(1999, 10, 05, 11, 11));
		propietario1.setIdentificacion("1726890000");
		propietario1.setNombre("Juan Carlos");
		this.propietarioRepository.insertar(propietario1);

		Matricula matricula1 = new Matricula();
		matricula1.setFecha(LocalDateTime.now());
		matricula1.setPropietario(propietario1);
		matricula1.setValor(new BigDecimal(500));
		matricula1.setVehiculo(vehiculo1);
		this.matriculaRepository.insertar(matricula1);

	}

}
