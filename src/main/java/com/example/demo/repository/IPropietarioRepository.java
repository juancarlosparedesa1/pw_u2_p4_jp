package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioRepository {
	public void insertar(Propietario propietario);

	public Propietario buscar(String identificacion);

	public void actualizar(Propietario propietario);

	public void eliminar(String identificacion);
}
