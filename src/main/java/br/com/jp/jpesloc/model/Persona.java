package br.com.jp.jpesloc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id;
	private String name;
	private String login;
	private String pws;
	private Role role;

	/**
	 * 
	 * @param name
	 * @param login
	 * @param pws
	 * @param role
	 */

	public Persona(String name, String login, String pws, Role role) {
		super();
		this.name = name;
		this.login = login;
		this.pws = pws;
		this.role = role;
	}

	public Persona() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPws() {
		return pws;
	}

	public void setPws(String pws) {
		this.pws = pws;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


}
