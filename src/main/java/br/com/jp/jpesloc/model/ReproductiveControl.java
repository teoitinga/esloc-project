package br.com.jp.jpesloc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Classe de registro de controle reprodutivo
 * sobre os dados registrado no rebanho, realizadas pela classe {@link ReproductiveControl}.
 * 
 * @author Jo�o Paulo Santana Gusm�o
 * @date 13/02/2020
 */
@Entity
public class ReproductiveControl implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private Date dataRegistro;
	private Bovino animalRegistro;
	private Bovino conceptor;
	/**
	 * 
	 * @param animalRegistro classe {@link VacaSeca}.
	 * @param conceptor classe {@link Touro}.
	 */
	public ReproductiveControl(VacaSeca animalRegistro, Touro conceptor) {
		super();
		this.dataRegistro = new Date();
		this.animalRegistro = animalRegistro;
		this.conceptor = conceptor;
	}
	
	public ReproductiveControl() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public Bovino getAnimalRegistro() {
		return animalRegistro;
	}
	public void setAnimalRegistro(Bovino animalRegistro) {
		this.animalRegistro = animalRegistro;
	}
	public Bovino getConceptor() {
		return conceptor;
	}
	public void setConceptor(Bovino conceptor) {
		this.conceptor = conceptor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animalRegistro == null) ? 0 : animalRegistro.hashCode());
		result = prime * result + ((conceptor == null) ? 0 : conceptor.hashCode());
		result = prime * result + ((dataRegistro == null) ? 0 : dataRegistro.hashCode());
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
		ReproductiveControl other = (ReproductiveControl) obj;
		if (animalRegistro == null) {
			if (other.animalRegistro != null)
				return false;
		} else if (!animalRegistro.equals(other.animalRegistro))
			return false;
		if (conceptor == null) {
			if (other.conceptor != null)
				return false;
		} else if (!conceptor.equals(other.conceptor))
			return false;
		if (dataRegistro == null) {
			if (other.dataRegistro != null)
				return false;
		} else if (!dataRegistro.equals(other.dataRegistro))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
