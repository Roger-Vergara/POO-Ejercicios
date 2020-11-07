class Llamando_a_una_persona {
	/*En esta clase se requiere de una persona(Clase persona)*/
	
	public static void main(String args[]){
		/*Ahora, ¿Como podemos utilizar la clase Persona para algo?
		 Pues simple, aquí es donde viene la creacion de una instancia
		 de la clase persona para darle un uso. Ejemplo con 3 instancias
		 en otra clase distinta: */
		
		//Aqui voy a comenzar pasarle valores a la persona 
		clase_persona persona_1 = new clase_persona("Juanito",12);
		clase_persona persona_2 = new clase_persona("Petronilo",23);
		clase_persona persona_3 = new clase_persona("Chayane",32);	
		
		//Ahora pongamos a trabajar a estas personas
		persona_1.Caminar(); //Si ejecuto este metodo, la persona comienza a caminar
		persona_1.Sentarse(); //Si ejecuto este otro, la persona comienza a sentarse
		
		//Lo mismo para los demas
		persona_2.Caminar();
		persona_2.Sentarse();
		
		persona_3.Caminar();
		persona_3.Sentarse();
		
	}
	
}
