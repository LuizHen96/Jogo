
public class Fase {
	private String nome;
	private Personagem[] personagens = new Personagem[8];
	private double[] velocidadePersonagens = new double[8];
	
	public Fase(String nome, Inimigo a, Inimigo b, Inimigo c, Inimigo d, Inimigo e, Jogador j)
	{
		this.nome = nome;
		personagens[0] = a;
		personagens[1] = b;
		personagens[2] = c;
		personagens[3] = d;
		personagens[4] = e;
		personagens[5]= j.getSeguidoresMissao(0);
		personagens[6]= j.getSeguidoresMissao(1);
		personagens[7]= j.getSeguidoresMissao(2);
		
		
		for(int i=0; i<8; i++)
		{
			velocidadePersonagens[i]= personagens[i].getVelocidadeAtaque();
		}
	}
	
	public boolean estaVivo(int i)
	{
		if(personagens[i].getVidaAtual() > 0)
		{
			return true;
		}
		return false;
	}
	
	public int vezJogador()	{
		int maiorIndice = 8;
		double maiorVelocidade =0;
		for(int i = 0; i<8; i++)
		{
			if(velocidadePersonagens[i] > maiorVelocidade){
				if(estaVivo(i))
				{
					maiorIndice = i;
					maiorVelocidade = velocidadePersonagens[i];
				}

			}
		}
		if(maiorVelocidade < 1)
		{
			for(int i=0; i<8; i++)
			{
				velocidadePersonagens[i]+= personagens[i].getVelocidadeAtaque();
			}
			return vezJogador();
		}
		velocidadePersonagens[maiorIndice] -= 1;
		return maiorIndice;
	}
	
	public boolean timeInimigoVivo()
	{
		for(int i=0; i<5; i++)
		{
			if(estaVivo(i))
				return true;
		}
		return false;
	}
	
	public boolean timeHeroiVivo()
	{
		for(int i=5; i<8; i++)
		{
			if(estaVivo(i))
				return true;
		}
		return false;
	}
	
	public void combateJogadores()
	{
		while(timeHeroiVivo() && timeInimigoVivo())
		{
			int vezJogador = this.vezJogador();
			int jogadorAlvo = 0;
			// Vez do Inimigo?
			if(vezJogador < 5)
			{
				for(int i=7; i>=5; i--)
				{
					if(estaVivo(i))
					{
						jogadorAlvo = i;
					}
				}
				personagens[jogadorAlvo].perderVida(personagens[vezJogador].getDano());
				System.out.println(personagens[vezJogador].getNome() + " causou " + personagens[vezJogador].getDano()+ "de dano a" + personagens[jogadorAlvo].getNome());
				if(!estaVivo(jogadorAlvo))
					System.out.println(personagens[jogadorAlvo].getNome() + " Morreu");
			}
			// Vez Aliado
			else
			{
				//System.out.println("Escolha o alvo da ação:");
				for(int i=4; i>=0;i++)
				{
					if(estaVivo(i))
					{
						jogadorAlvo = i;
					}
				}
				personagens[jogadorAlvo].perderVida(personagens[vezJogador].getDano());
				System.out.println(personagens[vezJogador].getNome() + " causou " + personagens[vezJogador].getDano()+ "de dano a" + personagens[jogadorAlvo].getNome());
				if(!estaVivo(jogadorAlvo))
					System.out.println(personagens[jogadorAlvo].getNome() + " Morreu");
			}
			
		}
		
	}

}
