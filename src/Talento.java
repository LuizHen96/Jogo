
public class Talento {
	private String nome;
	private String descricao;
	private int manaRequerida;
	private int custoDevocao;
	
	public Talento (String nome, String descricao, int mana, int custoDevocao)
	{
		this.nome = nome;
		this.descricao = descricao;
		this.manaRequerida = mana;
		this.custoDevocao = custoDevocao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getManaRequerida() {
		return manaRequerida;
	}

	public int getCustoDevocao() {
		return custoDevocao;
	}
}
