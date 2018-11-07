package com.buratti.curso.boot.domain;

import java.util.List;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;	
	
	@OneToMany(mappedBy = "departamento")	
	private List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

=======
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name= "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	
	@Column(name="nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamentos")
	private List<Cargo> cargos;

>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
<<<<<<< HEAD
	
=======

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	
}
