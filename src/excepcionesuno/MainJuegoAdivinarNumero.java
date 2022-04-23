package excepcionesuno;

import java.util.InputMismatchException;

/**
 * java-full-stack-dev-u10 - excepcionesUno - ejercicioUno
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 22/04/2022
 */
public class MainJuegoAdivinarNumero {

	public static void main(String[] args) {
		
		//declaracion de variables
		int numeroAleatorio;
		int numeroIntroducido = 0;
		int numeroIntentos = 0;
		Asistente asistente = new Asistente();
		
		//Generamos un número entre 1 y 500
		numeroAleatorio = asistente.generarNumeroAleatorio(1, 500);
		System.out.println("Adivina un número entre 1 y 500 ");
		
		//bucle que proporciona entrada y recoje la excepción y se ejecuta mientras no se adivine el número 
		do {
			
			System.out.println("Has efectuado: " + numeroIntentos + " Intentos");
			
			try {
				
				//si no se introduce un número mayor de o lanza la excepción InputMismatchException 
				numeroIntroducido = asistente.proporcionarEntrada();
				
				//si el numero introducido es menor que el aleatorio 
				if (numeroIntroducido < numeroAleatorio) {
					
					//incrementamos intentos he informamos que no es el numero
					numeroIntentos++;
					System.out.println("¡¡¿Oo no has adivinado el número!!! tu número es menor escribe un número más alto");
					
				} else {
					
					//incrementamos intentos he informamos que no es el numero
					numeroIntentos++;
					System.out.println("¡¡¿Oo no has adivinado el número!!! tu número es mayor escribe un número más bajo");
					
				}
				
				//capturamos la excepción
			} catch (InputMismatchException e) {
				
				//Si el usuario introduce algo que no es un numero se indica
				System.out.println("Has introducido algo que no es un número");
				//se cuenta como un intento
				numeroIntentos++;
				//indicamos que no se ha conseguido reconocer la entrada
				System.out.println("No hemos conseguido reconocer la entrada");
				
				
			} 
			
		} while (numeroIntroducido != numeroAleatorio);
		
		//cerramos scanner pues ya no lo necesitamos
		asistente.closeScannner();
		//Indicamos que ha acertado y que le ha costado N intentos 
		System.out.println("¡¡Enhorabuena acerataste!!! te ha costado " + numeroIntentos + " intentos");
		System.exit(0);
		
	}
		
}
