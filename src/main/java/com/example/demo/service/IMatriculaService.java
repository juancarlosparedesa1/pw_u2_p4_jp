package com.example.demo.service;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {

	public void añadir(Matricula matricula);

	public void crearMatricula(String identificacion, String placa);
}
