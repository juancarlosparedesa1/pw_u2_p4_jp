package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoService {

	public void guardar(Vehiculo vehiculo);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo vehiculo);

	public void borrar(String placa);
}
