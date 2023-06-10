package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, identificacion);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);

	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario prop = this.buscar(identificacion);
		this.entityManager.remove(prop);
	}
}
