package excepcionesuno;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


/**
 * java-full-stack-dev-u10 - excepcionesUno - Asistente
 *
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 22/04/2022
 */
//Clase Asistente que proporciona varias funciones y la funcion donde se lanza la excepcion InputMismatchException
public class Asistente {

	private Scanner scanner;	
	
	//Proporciona y valida la entrada del número y lanza una excepción si no es un número o es menor que 1
	public int proporcionarEntrada() throws InputMismatchException{

		int numero = 0;

		numero = this.getScanner().nextInt();
		//sies menor que uno
		if (numero < 1) {
			//lanza la excepcion InputMismatchException
			throw new InputMismatchException();
			
		}

		return numero;

	}
	
	//devolvemos scander recien seteado
	public Scanner getScanner() {
		this.setScanner(new Scanner(System.in));
		return scanner;
	}
	
	//cerramos scanner
	public void closeScannner() {
		this.scanner.close();
	}

	//seteamos scanner
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	//generamos un número aleatorio en base y tope
	public int generarNumeroAleatorio(int numBase, int numTope){
		
		Random random;
		int numeroAleatorio; 

		random = new Random();
	    numeroAleatorio = numBase + random.nextInt((numTope+1) - numBase);
		return numeroAleatorio;
		
	}
	
}
