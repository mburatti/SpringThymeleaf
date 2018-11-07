package com.buratti.curso.boot.domain;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
<<<<<<< HEAD
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {
=======
@Table(name="CARGOS")
public class Cargo extends AbstractEntity<Long> {
	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_departamento_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;
	
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
<<<<<<< HEAD

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarios;

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

=======
	
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
}
