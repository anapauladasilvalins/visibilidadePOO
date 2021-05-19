package aula03.canetas;

public class Caneta03 {
	public static void main (String[] args) {
		
		ModeloCaneta03 c1 = new ModeloCaneta03();
		c1.modelo = "Bic Cristal";
		c1.cor = "azul";
		//c1.ponta = 0.5f; //este atributo não é publico, é privado
		c1.carga = 80; // atributo protegido, porém, aceita devido a classe caneta estar dentro de uma classe que utiliza a classe caneta
		c1.tampada = false;
		c1.status();
		c1.rabiscar();
	}

}
