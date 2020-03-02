package br.com.jp.jpesloc.model;

public class TecnicoResponsavel extends Persona{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TecnicoResponsavel(String name, String login, String pws, Role role) {
		super(name, login, pws, Role.TECNICO);

	}
	public TecnicoResponsavel() {
		
	}
	
}
