
public class Guitarra {
	
	private String cor;
	private String marca;
	private int quantidadeDeCordas;
	private String tipoDaMadeira;
	private int quantidadeDeCasas;
	private String tipoDaPonte;
	
	public void tocar(){
		System.out.println("Estou tocando!");
	}
	
	public void solar(){
		System.out.println("Estou solando!");
	}
	
	public void abaixarVolume(){
		System.out.println("Estou abaixando o volume!");
	}
	
	public boolean cordaEstaArrebentada(){
		//Alguma l�gica para verificar se perdemos alguma corda no decorrer do uso da guitarra.
		return false;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidadeDeCordas() {
		return quantidadeDeCordas;
	}
	public void setQuantidadeDeCordas(int quantidadeDeCordas) {
		this.quantidadeDeCordas = quantidadeDeCordas;
	}
	public String getTipoDaMadeira() {
		return tipoDaMadeira;
	}
	public void setTipoDaMadeira(String tipoDaMadeira) {
		this.tipoDaMadeira = tipoDaMadeira;
	}
	public int getQuantidadeDeCasas() {
		return quantidadeDeCasas;
	}
	public void setQuantidadeDeCasas(int quantidadeDeCasas) {
		this.quantidadeDeCasas = quantidadeDeCasas;
	}
	public String getTipoDaPonte() {
		return tipoDaPonte;
	}
	public void setTipoDaPonte(String tipoDePonte) {
		this.tipoDaPonte = tipoDePonte;
	}
}
