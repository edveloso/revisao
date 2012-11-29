package br.com.edveloso.modelo;

public class Revisao {

	private String description;

	public Revisao(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "veio do to string "+ description+" - ";
	}
	
}
