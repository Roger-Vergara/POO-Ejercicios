//Roger Vergara 29.671.832

import javax.swing.JOptionPane;

/*Esto es lo que se conoce como clase
 o la escencia del objeto.
 * Para este ejemplo utilizara como recurso un vehículo*/
public class clase_carro {
	
	/*¿Cuales son las caracteristicas comunes de un carro?
	pues simple: El color, La marca, El modelo, Cuantas Ruedas tine, Entre
	otros elementos*/
	
	private String color; 
	private String marca;
	private String modelo;
	private int numero_ruedas;
	
	//Permitiendo inicializar los atributos
	public clase_carro(String color, String marca, String modelo, int ruedas){
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		numero_ruedas = ruedas;
	}
	 
	/*Ahora, ¿Que cosas puede hacer un carro?
	 pues muy facil: Acelerar, Frenar, Estacionarse, Explotar (vale, vale, no).*/ 
	public void Acelerar(){
		JOptionPane.showMessageDialog(null, "El carro " + marca + " - " + modelo 
		+ " de " + numero_ruedas + " ruedas, esta acelerando...");
	}
	 
	public void Frenar(){
		JOptionPane.showMessageDialog(null, "El carro " + marca + " - " + modelo 
		 + " de " + numero_ruedas + " ruedas, esta frenando...");
	}
	 
	public void Estacionar(){
		JOptionPane.showMessageDialog(null, "El carro " + marca + " - " + modelo 
		 + " de " + numero_ruedas + " ruedas, esta estacionando...");
	}
	 
	public static void main(String args[]){
		 
		 //Aqui voy a comenzar a pasar valores a los atributos
		 clase_carro carro_1 = new clase_carro("Rojo","Bugatti","Bolide",4);
		 clase_carro carro_2 = new clase_carro("Verde","Bentley","Continental GT",4);
		 clase_carro carro_3 = new clase_carro("Azul","Aston Martin","DB9",5);
		 
		 //Ahora pongamos a trabajar a estos carros
		
		 carro_1.Acelerar(); //Si llamo a este metodo, el carro comenzara a acelerar
		 carro_1.Frenar(); //Si llamo a este metodo, el carro comenzara a frenar
		 carro_1.Estacionar(); //Si llamo a este metodo, el carro comenzara a estacionarse
		 
		 //Lo mismo para los demas
		 carro_2.Acelerar(); 
		 carro_2.Frenar(); 
		 carro_2.Estacionar(); 
		 
		 carro_3.Acelerar(); 
		 carro_3.Frenar(); 
		 carro_3.Estacionar(); 
		 
	} 
	 
}
