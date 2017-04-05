
public class Homem {
	
	private String nome;
	private int idade;
	private String corDosOlhos;
	private double peso;
	private double altura;
	
	public void andar(){
		System.out.println("Estou andando!");
	}
	
	public void falar(){
		System.out.println("Estou falando!");
	}
	
	public void correr(){
		System.out.println("Estou correndo!");
	}
	
	public void dormir(){
		System.out.println("Estou dormindo!");
	}
	
	public void sentar(){
		System.out.println("Estou sentado!");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCorDosOlhos() {
		return corDosOlhos;
	}
	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}

