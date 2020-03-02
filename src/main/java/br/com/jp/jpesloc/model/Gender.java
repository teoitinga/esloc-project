package br.com.jp.jpesloc.model;

public enum Gender {
	MACHO("m"), FEMEA("f");

	private String gender;

	Gender(String gender) {

		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}
}