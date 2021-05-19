package aula03.canetas;

public class ModeloCaneta03 {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Caneta " + this.cor); //this. quer dizer auto refêrencia. é o nome do objeto que chamou
		System.out.println("Ponta: " + this.ponta);
		System.out.println("carga: " + this.carga); 
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	public void rabiscar() {
		
		if (this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar!");
		} else {
			System.out.println("Posso rabiscar!");
		}
	}
	 
	protected void tampar() {
		this.tampada = true; // this vai chamar o c1.This é uma referencia ao objeto que chamou.
		
	}
	
	protected void destampar() {
		this.tampada = false;
		
	}
	
}
