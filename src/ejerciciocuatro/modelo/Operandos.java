package ejerciciocuatro.modelo;

/**
 * java-full-stack-dev-u10 - ejerciciocuatro.modelo - Operador
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 26/04/2022
 */
public class Operandos {

	private int intOperandoA;
	private int intOperandoB;
	private double doubleOperandoA;
	private double resultado;
	
	/**
	 * 
	 */
	public Operandos() {
		this.intOperandoA = 0;
		this.intOperandoB = 0;
		this.doubleOperandoA = 0;
	}
	/**
	 * @param doubleOperandoA
	 * @param doubleOperadorB
	 */
	public Operandos(double doubleOperandoA) {
		this.doubleOperandoA = doubleOperandoA;
	}
	/**
	 * @param intOperandoA
	 * @param intOperandoB
	 */
	public Operandos(int intOperandoA, int intOperandoB) {
		this.intOperandoA = intOperandoA;
		this.intOperandoB = intOperandoB;
	}
	/**
	 * @return the intOperarorA
	 */
	public int getIntOperandoA() {
		return intOperandoA;
	}
	/**
	 * @param intOperandoA the intOperarorA to set
	 */
	public void setIntOperandoA(int intOperandoA) {
		this.intOperandoA = intOperandoA;
	}
	/**
	 * @return the intOperarorB
	 */
	public int getIntOperandoB() {
		return intOperandoB;
	}
	/**
	 * @param intOperandoB the intOperarorB to set
	 */
	public void setIntOperandoB(int intOperandoB) {
		this.intOperandoB = intOperandoB;
	}
	/**
	 * @return the doubleOperadorA
	 */
	public double getDoubleOperandoA() {
		return doubleOperandoA;
	}
	/**
	 * @param doubleOperandoA the doubleOperadorA to set
	 */
	public void setDoubleOperandoA(double doubleOperandoA) {
		this.doubleOperandoA = doubleOperandoA;
	}
	
	
	/**
	 * @return the resultado
	 */
	public double getResultado() {
		return resultado;
	}
	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
}
