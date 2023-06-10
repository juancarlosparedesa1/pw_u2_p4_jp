package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mat_seq")
	@SequenceGenerator(name = "mat_seq", sequenceName = "mat_seq", allocationSize = 1)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "mat_fecha")
	private LocalDateTime fecha;

	@Column(name = "mat_valor")
	private BigDecimal valor;

	@OneToOne
	private Propietario propietario;

	@OneToOne
	private Vehiculo vehiculo;

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fecha=" + fecha + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}

}
