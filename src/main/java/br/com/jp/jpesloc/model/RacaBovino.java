package br.com.jp.jpesloc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RacaBovino implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String raca;
	private String corDaPelagem;
	private String aptidao;
	
	
	public RacaBovino() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RacaBovino(String raca) {
		this.raca = raca;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCorDaPelagem() {
		return corDaPelagem;
	}
	public void setCorDaPelagem(String corDaPelagem) {
		this.corDaPelagem = corDaPelagem;
	}
	public String getAptidao() {
		return aptidao;
	}
	public void setAptidao(String aptidao) {
		this.aptidao = aptidao;
	}

}
