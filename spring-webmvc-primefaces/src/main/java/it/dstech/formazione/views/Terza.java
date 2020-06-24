package it.dstech.formazione.views;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "finale")
@SessionScoped

public class Terza {

	@ManagedProperty(value = "#{cambiaPagina.nome}")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
