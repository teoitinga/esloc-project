package br.com.jp.jpesloc.model;

public enum Role {
	MASTER("m"), ADMINISTRADOR("a"), COORDINATE("c"), TECNICO("t"), USER("u");

	private String categoria;

	Role(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}
}
