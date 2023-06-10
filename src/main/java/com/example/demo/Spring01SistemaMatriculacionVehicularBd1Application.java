package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Spring01SistemaMatriculacionVehicularBd1Application implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Spring01SistemaMatriculacionVehicularBd1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1.crear un vehiculo
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("Toyota");
		vehiculo1.setPlaca("psg123");
		vehiculo1.setModelo("2020");
		vehiculo1.setPrecio(new BigDecimal(5000));
		vehiculo1.setTipo("a");
		this.vehiculoService.guardar(vehiculo1);
		// 2.Actualizar dos atributos del vehiculo creado en el punto 1
		vehiculo1.setPrecio(new BigDecimal(8000));
		vehiculo1.setModelo("2023");
		this.vehiculoService.actualizar(vehiculo1);

		// 3.Crear un propietario
		Propietario propietario1 = new Propietario();
		propietario1.setApellido("paredes");
		propietario1.setFechaNacimiento(LocalDateTime.of(1999, 10, 05, 11, 11));
		propietario1.setIdentificacion("1726890000");
		propietario1.setNombre("Juan Carlos");
		this.propietarioService.crear(propietario1);

		// 4.Realizar una matricula del vehiculo a partir de los datos placa y
		// cedula del vehiculo utilizados en los untos 1 y 3
		this.matriculaService.crearMatricula(propietario1.getIdentificacion(), vehiculo1.getPlaca());

	}

}
