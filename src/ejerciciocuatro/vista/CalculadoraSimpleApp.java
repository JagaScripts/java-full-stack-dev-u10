
package ejerciciocuatro.vista;

import javax.swing.JOptionPane;

import ejerciciocuatro.controlador.Operaciones;

/**
 * java-full-stack-dev-u10 - ejerciciocuatro - CalculadoraSimple
 *
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 24/04/2022
 */
public class CalculadoraSimpleApp {

	private static Operaciones operaciones = new Operaciones();
	private static int numeroEntero = 0;
	private static double numeroDouble = 0;
	private static String entradaTeclado = "";
	private static boolean entradaValida = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		do {

			mostrarValidarMenu();

			// seleccionamos la figura calculamos y mostramos por pantalla
			switch (numeroEntero) {
			case 1:
				solicitarOperando("Introduce el sumando número 1");
				operaciones.setOperandoA(numeroEntero);
				solicitarOperando("Introduce el sumando número 2");
				operaciones.setOperandoB(numeroEntero);
				operaciones.suma();
				JOptionPane.showMessageDialog(null, "Operación suma " + operaciones.getOperandoA() + " + "
						+ operaciones.getOperandoB() + " = " + (int) operaciones.getResultado());
				break;
			case 2:
				solicitarOperando("Introduce el restando número 1");
				operaciones.setOperandoA(numeroEntero);
				solicitarOperando("Introduce el restando número 2");
				operaciones.setOperandoB(numeroEntero);
				operaciones.resta();
				JOptionPane.showMessageDialog(null, "Operación resta " + operaciones.getOperandoA() + " - "
						+ operaciones.getOperandoB() + " = " + (int) operaciones.getResultado());
				break;
			case 3:
				solicitarOperando("Introduce el coeficiente número 1");
				operaciones.setOperandoA(numeroEntero);
				solicitarOperando("Introduce el coeficiente número 2");
				operaciones.setOperandoB(numeroEntero);
				operaciones.multiplicacion();
				JOptionPane.showMessageDialog(null, "Operación multiplicación " + operaciones.getOperandoA() + " x "
						+ operaciones.getOperandoB() + " = " + (int) operaciones.getResultado());
				break;
			case 4:
				solicitarOperandoDouble("Introduce el radical de la raíz cuadrada");
				operaciones.setOperando(numeroDouble);
				operaciones.raizCuadrada();
				JOptionPane.showMessageDialog(null, "Operación raíz cuadrada " + operaciones.getOperando() + " sqrt "
						+ " = " + operaciones.getResultado());
				break;
			case 5:
				solicitarOperandoDouble("Introduce el radical de la raíz cúbica");
				operaciones.setOperando(numeroDouble);
				operaciones.raizCubica();
				JOptionPane.showMessageDialog(null, "Operación raíz cúbica " + operaciones.getOperando() + " cbrt "
						+ " = " + operaciones.getResultado());
				break;
			case 6:
				solicitarOperando("Introduce la base");
				operaciones.setOperando(numeroEntero);
				solicitarOperando("Introduce el exponente");
				operaciones.setOperandoB(numeroEntero);
				operaciones.potencia();
				JOptionPane.showMessageDialog(null, "Operación potencia " + operaciones.getOperandoA() + " ^ "
						+ operaciones.getOperandoB() + " = " + operaciones.getResultado());
				break;
			case 7:
				solicitarOperando("Introduce el dividendo");
				operaciones.setOperando(numeroEntero);
				solicitarOperando("Introduce el divisor");
				operaciones.setOperandoB(numeroEntero);
				try {
					
					operaciones.division();
					JOptionPane.showMessageDialog(null, "Operación división " + operaciones.getOperandoA() + " / "
							+ operaciones.getOperandoB() + " = " + operaciones.getResultado());
					
				} catch (ArithmeticException e) {
					
					JOptionPane.showMessageDialog(null, "División por cero");
					
				}
				
				
				break;

			}

		} while (numeroEntero != 8);

		cerrarAplicacion();

	}

	// Método para listar opciones del menú
	private static void mostrarValidarMenu() {

		do {

			entradaTeclado = JOptionPane.showInputDialog(null,
					"Menú de calculadora simple \n" + "1. Sumar dos números enteros \n"
							+ "2. Restar dos números enteros \n" + "3. Multiplicar dos números enteros \n"
							+ "4. Calcular raíz cuadrada \n" + "5. Calcular Raíz cúbica \n" + "6. Calcula potencia \n"
							+ "7. División de dos números enteros \n " + "8. Cerrar la aplicación \n\n"
							+ "Cancela en cualquier momento para cerrar la aplicación \n\n" + "Elige una opción \n");

			entradaValida = analizarEntrada(entradaTeclado);

			if (numeroEntero < 1 || numeroEntero > 8) {
				entradaValida = false;
			}

		} while (!entradaValida);

	}

	//Analizamos entrada entero
	private static boolean analizarEntrada(String entrada) {

		try {

			numeroEntero = Integer.parseInt(entrada);
			return true;

		} catch (NumberFormatException numFormatEx) {

			if (entrada == null) {

				cerrarAplicacion();

			}

			JOptionPane.showMessageDialog(null, "No has introducido una opción válida " + numFormatEx.getMessage());
			return false;
		}

	}
	
	//Analizamos entrada double
	private static boolean analizarEntradaDouble(String entrada) {

		try {

			numeroDouble = Double.parseDouble(entrada);
			return true;

		} catch (NumberFormatException numFormatEx) {

			if (entrada == null) {

				cerrarAplicacion();

			}

			JOptionPane.showMessageDialog(null, "No has introducido una opción válida " + numFormatEx.getMessage());
			return false;
		}

	}

	//cerramos la aplicación
	private static void cerrarAplicacion() {

		JOptionPane.showMessageDialog(null, "Se cerrara la aplición");
		System.exit(0);

	}

	//solicitamos operando entero
	private static void solicitarOperando(String mensaje) {

		do {

			entradaTeclado = JOptionPane.showInputDialog(null, mensaje);
			entradaValida = analizarEntrada(entradaTeclado);

		} while (!entradaValida);

	}
	
	//solicitamos operando double
	private static void solicitarOperandoDouble(String mensaje) {

		do {

			entradaTeclado = JOptionPane.showInputDialog(null, mensaje);
			entradaValida = analizarEntradaDouble(entradaTeclado);

		} while (!entradaValida);

	}

}
