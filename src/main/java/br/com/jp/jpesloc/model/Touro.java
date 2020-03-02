package br.com.jp.jpesloc.model;

import java.util.Date;
/**
 * 
 * Classe que registra os dados da Categoria de animal - Touro
 * realizadas pela classe {@link Animal}.
 * 
 * @author Jo�o Paulo Santana Gusm�o
 * @date 13/02/2020
 *
 */
public class Touro extends Bovino {
	/**
	 * 
	 * @param name           - nome do animal
	 * @param sexo           - sexo do animal
	 * @param raca           - raca do animal - {@link RacaBovino}
	 * @param dataNascimento - data de nascimento do animal
	 * @param rebanhoAtual   - especifica o rebanho atual no qual pertence o animal -  {@link Herd}
	 */
	public Touro(String name, Gender sexo, RacaBovino raca, Date dataNascimento, Herd rebanhoAtual) {
		super(CategoryAnimal.TOURO, name, raca, sexo, dataNascimento, rebanhoAtual);
		
	}
	
	/**
	 * M�todo que muda o estado do {@link Touro} para ABATE
	 * 
	 */
	public void changeToAbate() {
		this.setCategoria(CategoryAnimal.ABATE);
	}
}
