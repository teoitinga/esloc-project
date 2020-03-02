package br.com.jp.jpesloc.model;


import java.util.Date;

public interface Animal {
	public String getName();
	public Date getDataNascimento();
	public void setFather(Bovino animal);
	public void setMother(Bovino animal);
	public Bovino getFather();
	public Bovino getMother();
	public Gender getGender();
	public RacaBovino getRaca();
}
