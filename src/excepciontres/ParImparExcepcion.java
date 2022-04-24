package excepciontres;

/**
 * java-full-stack-dev-u10 - excepciontres - ParImparExcepcion
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/04/2022
 */
public class ParImparExcepcion extends Exception {

	//recoje el código de la excepcion
		private boolean esPar;

		//Constructor de clase
		public  ParImparExcepcion(boolean esPar) {
			super();
			this.esPar = esPar;
		}

		public  ParImparExcepcion() {
			super();
		}
		
		//Método propio mostrar mensaje personalizado
		@Override
		public String getMessage(){
		
			String mensaje = "";
			
			if (this.esPar) {
				
				mensaje = "Es par";
				
			} else {
				
				mensaje = "Es impar";
				
			}
			
			return mensaje;
		}
}
