package clases;

//Metodo 1
public class Proceso1 extends Thread{
	
	//El metodo run ya viene definido en Thread package implementado en el JDK por defualt. 
	//Run es importante
	
	
	//Es necesario agregar la anotacion @override cada vez que se trabaja con polimorfismo
	@Override
	public void run() {
		for(int i=0; i<=16; i++) {
			System.out.println("Proceso 1");
		}
	}
	
}
