package br.com.jp.jpesloc.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bovino implements Animal, Serializable { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long id;
	private String name;
	private Date dataNascimento;
	private Gender gender;
	private CategoryAnimal categoria;
	private Bovino father;
	private Bovino mother;
	private Herd rebanhoAtual;
	private RacaBovino raca;

	/**
	 * 
	 * @param categoria      - categoria do animal, especifica se � vaca seca, em lactacao,
	 *                       - touro, bezerro, etc - {@link CategoryAnimal}
	 * @param name           - nome do animal
	 * @param sexo           - sexo do animal
	 * @param raca           - raca do animal - {@link RacaBovino}
	 * @param dataNascimento - data de nascimento do animal
	 * @param rebanhoAtual   - especifica o rebanho atual no qual pertence o animal -  {@link Herd}
	 */
	public Bovino(CategoryAnimal categoria, String name, RacaBovino raca, Gender sexo, Date dataNascimento, Herd rebanhoAtual) {
		super();
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.categoria = categoria;
		this.rebanhoAtual = rebanhoAtual;
		this.gender = sexo;
		this.raca = raca;
	}

	public Bovino() {
		super();
	}

	public String getName() {
		return name;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public CategoryAnimal getCategoria() {
		return categoria;
	}

	protected void setCategoria(CategoryAnimal categoria) {
		this.categoria = categoria;
	}

	public Bovino getFather() {
		return father;
	}

	public void setFather(Bovino father) {
		this.father = father;
	}

	public Bovino getMother() {
		return mother;
	}

	public void setMother(Bovino animal) {
		this.mother = animal;

	}

	public Herd getRebanhoAtual() {
		return rebanhoAtual;
	}

	/**
	 * M�todo que muda o estado do {@link Bovino} para DESCARTE
	 * 
	 */
	public void changeToDescartar() {
		this.setCategoria(CategoryAnimal.DESCARTE);
	}

	/**
	 * M�todo que muda o estado do {@link Bovino} para VENDIDO
	 * 
	 */
	public void changeToVender() {
		this.setCategoria(CategoryAnimal.VENDIDO);
	}

	@Override
	public Gender getGender() {
		return this.gender;
	}

	@Override
	public RacaBovino getRaca() {
		return this.raca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setRebanhoAtual(Herd rebanhoAtual) {
		this.rebanhoAtual = rebanhoAtual;
	}

	public void setRaca(RacaBovino raca) {
		this.raca = raca;
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
		Bovino other = (Bovino) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
