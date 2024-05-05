package exfacadekj;
public class Bebida implements IProduto {
	
	private String descricao;
	private double preco;
	private int ml;

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

	public int getMl() {
		return ml;

	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 0;
	}

}
