package br.com.jp.jpesloc.model;

import java.util.Date;
/**
 * 
 * Classe que registra os dados da Categoria de animal - Vaca em lacta��o
 * realizadas pela classe {@link Animal}.
 * 
 * @author Jo�o Paulo Santana Gusm�o
 * @date 14/02/2020
 *
 */
public class VacaLactante extends Bovino {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param name           - nome do animal
	 * @param sexo           - sexo do animal
	 * @param raca           - raca do animal - {@link RacaBovino}
	 * @param dataNascimento - data de nascimento do animal
	 * @param rebanhoAtual   - especifica o rebanho atual no qual pertence o animal -  {@link Herd}
	 */
	public VacaLactante(String name, Gender sexo, RacaBovino raca, Date dataNascimento, Herd rebanhoAtual) {
		super(CategoryAnimal.VACA_LACTACAO, name, raca, sexo, dataNascimento, rebanhoAtual);
		
	}

	/**
	 * M�todo que muda o estado de Vaca Seca para vaca VACA_SECA
	 * 
	 */
	public void changeToVacaLactante() {
		this.setCategoria(CategoryAnimal.VACA_LACTACAO);
	}

	/**
	 * M�todo que muda o estado de Vaca Seca para vaca ABATE
	 * 
	 */
	public void changeToVacaAbate() {
		this.setCategoria(CategoryAnimal.ABATE);
	}	
}
