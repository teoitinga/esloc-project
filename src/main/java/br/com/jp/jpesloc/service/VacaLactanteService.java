package br.com.jp.jpesloc.service;

import br.com.jp.jpesloc.model.Animal;

public class VacaLactanteService extends BovinoService {
	
	
	
	public static void main(String args[]) {

			try {
				info();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	public boolean registraCompra(Animal animal) {
		return true;
	}
	public boolean registraVende() {
		return true;		
	}
	public boolean registraDescarta() {
		return true;
	}
	public boolean registraMorre() {
		return true;
	}
	
}
