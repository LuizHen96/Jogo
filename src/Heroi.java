import Itens.*; 

public class Heroi extends Personagem{
	private Classe classe;
	private Raca raca;
	private Deus deus;
	private Talento[][] talentosEscolhido = new Talento[4][5];
	private Armadura[] set = new Armadura[6];
	
	private int forca;
	private int inteligencia;
	private int maestria;
	private int vigor;
	private int destresa;
	private int defesa;
	
	private double acertoCritico;
	private double danoCritico;
	private double reducaoDano;
	
	private int vidaMaxima;
	
	private int manaMaxima;
	private int manaAtual;
	
	public Heroi(Raca raca, Classe classe, String nome)
	{
		this.nome = nome;
		this.raca = raca;
		this.classe = classe;
		
		switch(classe.getNome()){
			case("Guerreiro"):
				forca = 7;
				inteligencia = 2;
				maestria = 5;
				vigor = 6;
				destresa = 4;
				defesa = 6;
			case("Mago"):
				forca = 3;
				inteligencia = 9;
				maestria = 7;
				vigor =3;
				destresa = 6;
				defesa = 3;
			case("Arqueiro"):
				forca = 5;
				inteligencia = 4;
				maestria = 6;
				vigor = 4;
				destresa = 8;
				defesa = 4;
		}
		this.calculaAtributosSecundarios();
		vidaAtual = vidaMaxima;
		manaAtual = manaMaxima;
	}
	
	private void calculaAtributosSecundarios()
	{
		velocidadeAtaque = destresa / 10;
		vidaMaxima = vigor * 10;
		manaMaxima = inteligencia * 10;
		reducaoDano = defesa;
	}
	public void setDeus(Deus deus)
	{
		this.deus = deus;
	}


	public Classe getClasse() {
		return classe;
	}

	public Raca getRaca() {
		return raca;
	}

	public Deus getDeus() {
		return deus;
	}

	public int getForca() {
		return forca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getMaestria() {
		return maestria;
	}

	public int getVigor() {
		return vigor;
	}

	public int getDestresa() {
		return destresa;
	}

	public int getDefesa() {
		return defesa;
	}

	public double getAcertoCritico() {
		return acertoCritico;
	}

	public double getDanoCritico() {
		return danoCritico;
	}
	public double getReducaoDano() {
		return reducaoDano;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public int getManaMaxima() {
		return manaMaxima;
	}

	public int getManaAtual() {
		return manaAtual;
	}
	
	public void addCabeca(Cabeca cabeca)
	{
		this.set[0] = cabeca;
	}
	
	public void addOmbro(Ombro ombreira)
	{
		this.set[1] = ombreira;
	}
	public void addTorso(Torso peitoral)
	{
		this.set[2] = peitoral;
	}
	public void addLuvas(Luvas luvas)
	{
		this.set[3] = luvas;
	}
	public void addPernas(Cabeca pernas)
	{
		this.set[4] = pernas;
	}
	public void addPe(Pe pe)
	{
		this.set[5] = pe;
	}
	
	@Override
	public void perderVida(int x){
		vidaAtual -= x;
		if(vidaAtual < 0)
			vidaAtual = 0;
	}
	@Override
	public int getDano()
	{
		return forca;
	}
}
