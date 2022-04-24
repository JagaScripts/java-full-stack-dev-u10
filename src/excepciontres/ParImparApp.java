/**
 * 
 */
package excepciontres;

import java.util.Random;

/**
 * java-full-stack-dev-u10 - excepciontres - ParImparApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/04/2022
 */
public class ParImparApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//generamos un número aleatorio
		int numeroAleatorio = generarNumeroAleatorio(0, 999);
		System.out.println("Generando número aleatorio...");
		System.out.println("El número aleatorio es: " + numeroAleatorio);
		//controla por medio de excepciones si un número es par o impar
		try {
			
			//Resuelve çodigo de Excepción si el numero es par o impar
			
			if (numeroAleatorio % 2 == 0) {
				throw new ParImparExcepcion(true);
			}else {
				throw new ParImparExcepcion(false);
			}
			
		}catch (ParImparExcepcion ex) {
			
			//Recupera el código de la excepción y muestra el mensaje
			System.out.println(ex.getMessage());
		}

	}

	//generamos un número aleatorio en base y tope
	public static int generarNumeroAleatorio(int numBase, int numTope) {

		Random random;
		int numeroAleatorio;

		random = new Random();
		numeroAleatorio = numBase + random.nextInt((numTope + 1) - numBase);
		return numeroAleatorio;

	}

}
