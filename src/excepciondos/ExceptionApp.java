package excepciondos;

import excepciondos.excepcioncustom.MiExcepcion;

/**
 * excepciones - clases - ExceptionApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/04/2022
 */
public class ExceptionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Bloque try{} en el que comienza  
		try {
			
			//Mostrando un mensaje por pantalla
			System.out.println("Mensaje mostrado por pantalla");
			
			// Resuelve cçodigo de Excepción
			Exception excepcion = new MiExcepcion("Excepción capturada con mensaje: Esto es un objeto Exception");
			
			throw excepcion;
	
		}catch (MiExcepcion ex) {
			
			//Recupera el código de la excepción y muestra el mensaje
			System.out.println(ex.getMessage());
			System.out.println("Programa terminado");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
