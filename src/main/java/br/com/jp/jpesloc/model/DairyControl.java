package br.com.jp.jpesloc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DairyControl implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private VacaLactante vaca;
	private Date data;
	private TecnicoResponsavel tecnico;
	private float quantidade;
	private float consumo;
	private String obs;
	
	public DairyControl(VacaLactante vaca, TecnicoResponsavel tecnico, float quantidade, float consumo, String obs) {

		this.vaca = vaca;
		this.tecnico = tecnico;
		this.quantidade = quantidade;
		this.consumo = consumo;
		this.obs = obs;
		this.data = new Date();
		
	}
	
	public DairyControl() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VacaLactante getVaca() {
		return vaca;
	}
	public void setVaca(VacaLactante vaca) {
		this.vaca = vaca;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TecnicoResponsavel getTecnico() {
		return tecnico;
	}
	public void setTecnico(TecnicoResponsavel tecnico) {
		this.tecnico = tecnico;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
}
