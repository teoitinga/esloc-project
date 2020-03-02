package br.com.jp.jpesloc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * Classe que registra os dados da propriedade rural
 * realizadas pela classe {@link Farm}.
 * 
 * @author Jo�o Paulo Santana Gusm�o
 * @date 13/02/2020
 *
 */
@Entity
public class Farm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String name;
	private double areaTotal;
	@OneToMany
	private List<Herd> rebanhos;
	private TecnicoResponsavel tecnico;
	private ProdutorRural proprietario;
	/**
	 * 
	 * @param name
	 * @param areaTotal
	 * @param tecnico
	 * @param proprietario
	 */
	public Farm(String name, double areaTotal, TecnicoResponsavel tecnico,
			ProdutorRural proprietario) {
		super();
		this.name = name;
		this.areaTotal = areaTotal;
		this.tecnico = tecnico;
		this.proprietario = proprietario;
		rebanhos = new ArrayList<>();
	}
	
	public Farm() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	public List<Herd> getRebanhos() {
		return rebanhos;
	}
	public void setRebanhos(List<Herd> rebanhos) {
		this.rebanhos = rebanhos;
	}
	public TecnicoResponsavel getTecnico() {
		return tecnico;
	}
	public void setTecnico(TecnicoResponsavel tecnico) {
		this.tecnico = tecnico;
	}
	public ProdutorRural getProprietario() {
		return proprietario;
	}
	public void setProprietario(ProdutorRural proprietario) {
		this.proprietario = proprietario;
	}
	/**
	 * Limpa todos os registros de rebanho da propriedade atual
	 */
	public void kill() {
		rebanhos.clear();
	}
	
}
