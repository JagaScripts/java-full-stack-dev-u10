package ejerciciocinco;

/**
 * java-full-stack-dev-u10 - ejercicio5 - Password
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 26/04/2022
 */
public class Password {

	//Declaramos una constante con todos los caracteres para generar la contraseña aleatoria
	public static final String DIGITOS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	private int longitud;
	private String contrasena;
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.generarPassword();
	}

	// Contructor pasando la longitud de la contrasena con el propio metodo de clase
	// generar contraseña aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		this.generarPassword();

	}

	//Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	//Metodo para generar contraseña aleatoria
	public void generarPassword() {
		
		this.contrasena = "";
		
		for (int i = 0; i < this.longitud; i++) {

			this.contrasena += (DIGITOS.charAt((int) (Math.random() * DIGITOS.length())));

		}

	}
	
	//La contraseña es fuertes si
	public boolean esFuerte() {
		
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		char caracter = '0';
		
		//recorremos para contar los caracteres
		for (int i = 0; i < this.longitud; i++) {
			
			caracter = this.contrasena.charAt(i);
			
			if (Character.isUpperCase(caracter)) {
				
				mayusculas++;
				
			}else if (Character.isLowerCase(caracter)){
				
				minusculas++;
				
			}else if(Character.isDigit(caracter)) {
				
				numeros++;
			}
			
		}
		
		//tiene mas de 2 mayusculas 1 minuscula y mas de 5 números
		if (mayusculas > 2 && minusculas > 1 && numeros > 5) {
			
			return true;
			
		} 
		
		return false;
	}
	
			
}
