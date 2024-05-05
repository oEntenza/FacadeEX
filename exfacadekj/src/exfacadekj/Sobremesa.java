package exfacadekj;
public class Sobremesa implements IProduto {
	
	private String descricao;
	private double preco;
	private String tamanho;

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

	public String getTamanho() {
		return tamanho;

	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
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
