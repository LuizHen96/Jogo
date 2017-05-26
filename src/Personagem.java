
public class Personagem {
	protected String nome;
	protected double velocidadeAtaque;
	protected int vidaAtual;
	
	public double getVelocidadeAtaque() {
		return velocidadeAtaque;
	}
	
	
	public int getDano()
	{
		return 0;
	}
	
	public void perderVida(int x){
	}
	
	public int getVidaAtual()
	{
		return vidaAtual;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void acaoPersonagem(){
	}
}
