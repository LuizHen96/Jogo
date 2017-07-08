
public class Inimigo extends Personagem{
	private int vidaMaxima;
	private int nivel;
	

	public Inimigo(String nome, int nivel)
	{
		this.nome = nome;
		this.nivel = nivel;
		vidaMaxima = nivel*10;
		vidaAtual = vidaMaxima;
	}


	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public int getNivel() {
		return nivel;
	}
	
	@Override
	public void perderVida(int x){
		vidaAtual -= x;
		if(vidaAtual < 0)
			vidaAtual = 0;
	}
	@Override
	public int getDano(){
		return nivel;
	}
	
	@Override
	public void acaoPersonagem(){
		
	}
	
}
