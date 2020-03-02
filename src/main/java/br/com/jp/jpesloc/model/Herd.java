package br.com.jp.jpesloc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Fornece informa��es do rebanho
 * 
 * @author Jo�o Paulo Santana Gusm�o
 * @date 13/02/2020
 *
 */
@Entity
public class Herd implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String lote;
	@OneToMany
	private List<Bovino> animais;

	/**
	 * 
	 * @param lote nome de referencia do lote de animais
	 */
	public Herd(String lote) {
		animais = new ArrayList<>();
		this.lote = lote;
	}

	public Herd() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public List<Bovino> getAnimais() {
		return animais;
	}

	private void setAnimais(List<Bovino> animais) {
		this.animais = animais;
	}
	/**
	 * Remove todos os animais registrado no rebanho atual
	 */
	public void kill() {
		this.animais.clear();
	}
	public void addAnimal(Bovino animal) {
		this.animais.add(animal);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Herd other = (Herd) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
