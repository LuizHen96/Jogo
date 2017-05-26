
public class Deus {
	private String nome;
	private String elemento;
	private Talento[][] talentosDeus = new Talento[3][5];
	
	public Deus(String nome, String elemento, Talento[][] talentos)
	{
		this.nome = nome;
		this.elemento = elemento;
		this.talentosDeus = talentos;
	}

	public String getNome() {
		return nome;
	}

	public String getElemento() {
		return elemento;
	}

	public Talento getTalento(String classe, int numeroTalento) {
		switch(classe){
			case "Guerreiro":
				return talentosDeus[0][numeroTalento];
			case "Mago":
				return talentosDeus[1][numeroTalento];
			case "Arqueiro":
				return talentosDeus[2][numeroTalento];
		}
		return null;
	}
	

}
