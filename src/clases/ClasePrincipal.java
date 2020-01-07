package clases;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		//Podemos instanciar de esta manera debido a que proceso1 
		//hereda de la case thread
		Proceso1 hilo1 = new Proceso1();
		
		Proceso1 hilo3 = new Proceso1();
		
		//Aqui hacemos una instancia a la clase thread debido a que proceso2 no esta heredando de dicha clase,
		// si no esta siendo implementado por la interface runnable
		Thread hilo2 = new Thread(new  Proceso2());
		
		//Con start() corremos un hilo

		hilo1.start();
		hilo3.start();
		hilo2.start();
		
		
		
		// Primero creamos TODAS las instancia de los hilos antes de correrlo. Si creamos ina instancia, seguido por su start(), por cada uno de las instancias de
		// hilos diferentes, pasara lo mismo a que si no estuvieramos usando hilos como la siguiente manera
		/*
		 Proceso1 hilo1 = new Proceso1();
		 hilo1.start();
		 
		 Thread hilo2 = new Thread(new  Proceso2());
		 hilo2.start();
		 
		 * */
		
	}
}
