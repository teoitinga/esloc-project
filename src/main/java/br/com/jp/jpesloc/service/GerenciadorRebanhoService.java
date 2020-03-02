package br.com.jp.jpesloc.service;

import java.util.Calendar;
import java.util.Date;

import br.com.jp.jpesloc.model.Bovino;
import br.com.jp.jpesloc.util.AgeAnimal;

/**
 * Servi�o respons�vel por gerenciar as categorias animais ajustando sempre que necess�rio
 * @author Jo�o Paulo
 *
 */
public class GerenciadorRebanhoService {
	
	private void upgradeAnimal(Bovino animal) {
		
		
	}
	/**
	 * M�todo que trata por definir parametros e formata��o da idade do animal
	 * @param animal - Classe {@link Bovino}
	 * @return {@link AgeAnimal}
	 * @see AgeAnimal
	 */
	public AgeAnimal idadeDoAnimal(Bovino animal) {

		Date dataNascimento = new Date();
		Date dataConsulta= animal.getDataNascimento();
		
		Long time = dataConsulta.getTime() - dataNascimento.getTime();
		
		Calendar c = Calendar.getInstance();
		c.setTime(dataNascimento);
		
		AgeAnimal age = new AgeAnimal(animal.getDataNascimento(), new Date());
		return age;
		
	}
}
