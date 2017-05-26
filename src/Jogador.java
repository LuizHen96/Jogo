
public class Jogador{
	private String nome;
	private Heroi seguidores[] = new Heroi[10];
	private Heroi seguidoresMissao[] = new Heroi[3];
	private int nSeguidores;
	private int nSeguidoresMissao;
	
	
	private Jogador(String nome)
	{
		this.nome = nome;
	}
	
	public  void addSeguidor(Heroi p) throws Exception
	{
		if(nSeguidores < 10)
		{
			seguidores[nSeguidores] = p;
			nSeguidores++;
		}
		else
		{
			throw new Exception("Limite maximo de seguidores, remova algum seguidor para adiciona-lo.");
		}
	}

	public  void addSeguidorMissao(Heroi p) throws Exception
	{
		if(nSeguidoresMissao < 3)
		{
			seguidoresMissao[nSeguidoresMissao] = p;
			nSeguidoresMissao++;
		}
		else
		{
			throw new Exception("Limite maximo de seguidores, remova algum seguidor para adiciona-lo.");
		}
	}
	
	public void removeSeguidor(int n)
	{
		seguidores[n] = null;
		if(n != nSeguidores-1)
		{
			seguidores[n] = seguidores[nSeguidores-1];
			seguidores[nSeguidores-1] = null;
		}
		nSeguidores--;
		
	}
	
	public void removeSeguidorMissao(int n)
	{
		seguidoresMissao[n] = null;
		if(n != nSeguidoresMissao-1)
		{
			seguidoresMissao[n] = seguidoresMissao[nSeguidoresMissao-1];
			seguidoresMissao[nSeguidoresMissao-1] = null;
		}
		nSeguidoresMissao--;
	}


	public String getNome() {
		return nome;
	}


	public Heroi[] getSeguidores() {
		return seguidores;
	}


	public Heroi[] getSeguidoresMissao() {
		return seguidoresMissao;
	}
	
	public Heroi getSeguidoresMissao(int a){
		return seguidoresMissao[a];
	}
	
	
	
}
