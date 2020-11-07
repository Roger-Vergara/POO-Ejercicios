import javax.swing.JOptionPane;

public class clase_persona {
	
	/*¿Cuales son las caracteristicas comunes de un carro?
	pues algunas de ellas son el nombre y la edad*/
	public String nombre;
	public int edad;
	
	//Permitiendo inicializar los atributos
	public clase_persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/*Ahora, ¿Que cosas puede hacer un persona?
	 pues algunas de esa cosas es Caminar y Sentarse*/
	public void Caminar(){
		JOptionPane.showMessageDialog(null, nombre + " de " + edad + ", esta caminando");
	}
	
	public void Sentarse(){
		JOptionPane.showMessageDialog(null, nombre + " de " + edad + ", se esta sentando");
	}
	
}
