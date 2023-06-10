package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);

	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(identificacion);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);
	}

}
