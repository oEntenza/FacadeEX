package exfacadekj;
public class Combo {
	private Burguer burguer;
	private Bebida bebida;
	private Sobremesa sobremesa;

	public Combo() {
		this.burguer = new Burguer();
		this.bebida = new Bebida();
		this.sobremesa = new Sobremesa();
		Burguer burguer = new Burguer();
		Bebida bebida = new Bebida();
		Sobremesa sobremesa = new Sobremesa();
	}

	public void CriarCombo(int tipo) {
		if (tipo == 1) {
			burguer.setDescricao("Big Guaru");
			burguer.setPreco(18.50);
			burguer.setGramas(200);
			bebida.setDescricao("Coca Zero");
			bebida.setPreco(8);
			bebida.setMl(500);
			sobremesa.setDescricao("Casquinha");
			sobremesa.setPreco(4);
			sobremesa.setTamanho("Pequeno");
		}
		if (tipo == 2) {
			burguer.setDescricao("Extra Guarucity Super Giga Burguer");
			burguer.setPreco(32.50);
			burguer.setGramas(500);
			bebida.setDescricao("Sprite X Maçã Verde");
			bebida.setPreco(12);
			bebida.setMl(1000);
			sobremesa.setDescricao("Milk Shake");
			sobremesa.setPreco(14);
			sobremesa.setTamanho("Grande");
		}

	}

	public void MostrarCombo() {
		System.out.println("Burguer: " + burguer.getDescricao());
		System.out.println("Preço: " + burguer.getPreco() + "R$");
		System.out.println("Peso: " + burguer.getGramas() + " gramas");
		System.out.println();
		System.out.println("Bebida: " + bebida.getDescricao());
		System.out.println("Preço: " + bebida.getPreco() + "R$");
		System.out.println("Quantidade: " + bebida.getMl() + " mls");
		System.out.println();
		System.out.println("Sobremesa: " + sobremesa.getDescricao());
		System.out.println("Preço: " + sobremesa.getPreco() + "R$");
		System.out.println("Tamanho: " + sobremesa.getTamanho());

	}
}
