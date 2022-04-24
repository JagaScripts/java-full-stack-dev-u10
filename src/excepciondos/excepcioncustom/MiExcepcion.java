package excepciondos.excepcioncustom;

/**
 * excepciones - clases - MiExcepcion
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 19/04/2022
 */
public class MiExcepcion extends Exception{

	//recoje el código de la excepcion
	private String mensajeExplicativo;

	//Constructor de clase
	public MiExcepcion(String mensajeExplicativo) {
		super();
		this.mensajeExplicativo = mensajeExplicativo;
	}

	public MiExcepcion() {
		super();
	}

	// Método propio mostrar mensaje personalizado
	@Override
	public String getMessage() {	
		return mensajeExplicativo;		
	}
	
}
