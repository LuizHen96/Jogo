
public class Jogador{
	private String nome;
	private Heroi herois[] = new Heroi[3];

	
	private Jogador(String nome)
	{
		this.nome = nome;
	}
	

	public String getNome() {
		return nome;
	}


	public Heroi getHerois(int i) {
		return herois[i];
	}
	
	public Heroi[] getHerois() {
		return herois;
	}
	
}
