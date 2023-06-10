package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioService {
	public void crear(Propietario propietario);

	public Propietario buscar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);
}
