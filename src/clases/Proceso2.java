package clases;

//Metodo 2
public class Proceso2 implements Runnable{
	
	@Override
	public void run() {
	
		for(int i=0; i<=16; i++) {
			System.out.println("Proceso 2");
		}
		
	}

}
