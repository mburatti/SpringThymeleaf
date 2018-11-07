package com.buratti.curso.boot.domain;
<<<<<<< HEAD

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	@Column(nullable=false)
	private String logradouro;
		
=======
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="ENDERECO")
public class Endereco extends AbstractEntity<Long> {

	@Column(nullable=false)
	private String logradouro;
	
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	@Column(nullable=false)
	private String bairro;
	
	@Column(nullable=false)
	private String cidade;
	
<<<<<<< HEAD
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(nullable = false, length = 9)
	private String cep;
	
	@Column(nullable = false, length = 5)
	private Integer numero;
		
=======
	@Column(nullable=false, length=2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(nullable=false, length=9)
	private String cep;
	
	@Column(nullable=false, length=5)
	private Integer numero;
	
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
<<<<<<< HEAD
	
=======
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
}
