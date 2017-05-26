package Itens;

public abstract class Armadura {

	private String nome;
	private String descricao;
	private int defesa;
	private int vigor;
	private int intelecto;
	private int destresa;
	private int forca;
	private int nivel;
	
	public Armadura(String nome, String descricao, String tipo, int nivel)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.nivel = nivel;
		switch(tipo)
		{
		case("Placas"):
			this.defesa = nivel *5;
			this.destresa = 0;
			this.intelecto = 0;
			this.forca = nivel*2;
			this.vigor = nivel *3;

		case("Malha"):
			this.defesa = nivel *3;
			this.destresa = nivel * 4;
			this.intelecto = 0;
			this.forca = nivel*1;
			this.vigor = nivel *2;
	
		case("Couro"):
			this.defesa = nivel *2;
			this.destresa = nivel * 2;
			this.intelecto = nivel * 5;
			this.forca = 0;
			this.vigor = nivel *1;
			
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

	public int getVigor() {
		return vigor;
	}

	public int getIntelecto() {
		return intelecto;
	}

	public int getDestresa() {
		return destresa;
	}

	public int getForca() {
		return forca;
	}

	public int getNivel() {
		return nivel;
	}
	
	
	
}

	