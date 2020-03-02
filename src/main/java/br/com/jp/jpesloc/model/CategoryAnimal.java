package br.com.jp.jpesloc.model;
/**
 * 
 * Classe que define as categorias de cada animal do rebanho. Aqui � especificado
 * se o animal � vaca em lacatacao, touro, bezerro, se foi vendido ou descartado
 * @author Jo�o Paulo Santana Gusm�o
 * @date 14/02/2020 
 */
public enum CategoryAnimal {

	BEZERRO("bo"), NOVILHO("no"), VACA_SECA("vs"), VACA_LACTACAO("vc"), TOURO("tr"), VENDIDO("vd"), ABATE("ab"),
	DESCARTE("ds");

	private String categoria;

	CategoryAnimal(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}
}
