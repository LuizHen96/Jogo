package Itens;

public class Armadura {

	private String nome;
	private String descricao;
	private int defesa;
	private int vida;
	private int nivel;
	
	public Armadura(String nome, String descricao, String tipo, int nivel)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.nivel = nivel;
		switch(tipo)
		{
		case("Pesada"):
			this.defesa = nivel *5;
			this.vida = nivel *3;

		case("Media"):
			this.defesa = nivel *3;
			this.vida = nivel *2;
	
		case("Leve"):
			this.defesa = nivel *2;
			this.vida = nivel *1;
			
		}
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getVida() {
		return vida;
	}


	public int getNivel() {
		return nivel;
	}
	
	
	
}

	