/**
 * 
 */
package ejerciciocinco;

import javax.swing.JOptionPane;

import ejerciciocuatro.controlador.Operaciones;

/**
 * java-full-stack-dev-u08 - ejercicio2 - AppPassword
 *
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 19/04/2022
 */
public class AppPassword {

	private static int longitudArray = 0;
	private static int longitudContrasena = 0;
	private static String entradaTeclado = "";
	private static boolean entradaValida = false;

	public static void main(String[] args) {

		
		//solicitamos el numero para generar la array de passwords
		longitudArray = solicitarNumero("Introduce el tamaño de la array de Password que desees");

		// Declaramos 2 objetos array uno para password y otro para la fortaleza de la contrasena
		Password passwords[] = new Password[longitudArray];
		boolean sonFuertes[] = new boolean[longitudArray];

		//solicitamos la longitud de las contrasenas
		longitudContrasena = solicitarNumero("Introduce la longitud de los Passwords que desees");

		//bucle crear array contraseñas y array de fortalezas  
		for (int i = 0; i < longitudArray; i++) {

			passwords[i] = new Password(longitudContrasena);
			sonFuertes[i] = passwords[i].esFuerte();
		
			// Mostramos el funcionamiento
			System.out.println("Contraseña " + i + " " + passwords[i].getContrasena() + " fortaleza " + sonFuertes[i]);

		}

	}

	// Analizamos entrada entero
	private static int analizarEntrada(String entrada) {

		int numero = 0;

		try {

			numero = Integer.parseInt(entrada);
			return numero;

		} catch (NumberFormatException numFormatEx) {

			if (entrada == null) {

				cerrarAplicacion();

			}

			JOptionPane.showMessageDialog(null, "No has introducido una opción válida " + numFormatEx.getMessage());

		}

		return numero;

	}

	// cerramos la aplicación
	private static void cerrarAplicacion() {

		JOptionPane.showMessageDialog(null, "Se cerrara la aplición");
		System.exit(0);

	}

	// solicitamos operando entero
	private static int solicitarNumero(String mensaje) {

		int numero = 0;
		do {

			entradaTeclado = JOptionPane.showInputDialog(null, mensaje);

			numero = analizarEntrada(entradaTeclado);

			if (numero != 0) {

				entradaValida = true;

			}

		} while (!entradaValida);

		return numero;

	}

}
