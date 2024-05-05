package exfacadekj;
public class Burguer implements IProduto {

	private String descricao;
	private double preco;
	private int gramas;

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getGramas() {
		return gramas;
	}

	public void setGramas(int gramas) {
		this.gramas = gramas;

	}

	@Override
	public String descricao() {
		return null;
	}

	@Override
	public double preco() {
		return 0;
	}


}
