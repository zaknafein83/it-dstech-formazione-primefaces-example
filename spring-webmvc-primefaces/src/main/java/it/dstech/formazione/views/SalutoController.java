package it.dstech.formazione.views;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.util.StringUtils;

@ManagedBean(name = "saluto")
@ViewScoped
public class SalutoController {

	private String nome;
	
	private String old = "Inserisci nome";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void inverti() {
		this.setOld(nome);
		System.out.println(StringUtils.capitalize(nome));
	}

	public String getOld() {
		return old;
	}

	public void setOld(String old) {
		this.old = old;
	}
}
