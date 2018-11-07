package com.buratti.curso.boot.domain;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@MappedSuperclass
<<<<<<< HEAD
public class AbstractEntity<ID extends Serializable> implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

=======
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity<?> other = (AbstractEntity<?>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "id=" + id;
	}
	
	
	
=======
		return "id =" + id;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
>>>>>>> 83b0e6da6ea459e792a5f3af8835410392c5dbe9
}
