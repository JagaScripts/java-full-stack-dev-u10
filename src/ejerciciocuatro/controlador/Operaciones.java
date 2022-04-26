/**
 * 
 */
package ejerciciocuatro.controlador;

import ejerciciocuatro.modelo.Operandos;

/**
 * java-full-stack-dev-u10 - ejerciciocuatro.controlador - Operaciones
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 26/04/2022
 */

//Clase proporciona operaciones para separa el código en diferente packages
public class Operaciones {

	private Operandos operandos;
	
	public Operaciones() {
		this.operandos = new Operandos();
	}

	/**
	 * @param operandos
	 */
	public Operaciones(double doubleOperadorA) {
		this.operandos = new Operandos(doubleOperadorA);
	}
	
	/**
	 * @param operandos
	 */
	public Operaciones(int doubleOperadorA, int doubleOperadorB) {
		this.operandos = new Operandos(doubleOperadorA, doubleOperadorB);
	}

	/**
	 * @return the operandos
	 */
	public Operandos getOperandos() {
		return operandos;
	}

	/**
	 * @param operandos the operandos to set
	 */
	public void setOperando(Double operandoA) {
		this.operandos.setDoubleOperandoA(operandoA);
		
	}
	
	/**
	 * @param operandos the operandos to set
	 */
	public void setOperandos(int operandoA, int operandoB) {
		operandos.setIntOperandoA(operandoA);
		operandos.setIntOperandoB(operandoB);

	}
	
	//suma
	public void suma() {
		
		this.setResultado(this.operandos.getIntOperandoA() + this.operandos.getIntOperandoB());
		
	}
	
	//resta
	public void resta() {
		
		this.setResultado(this.operandos.getIntOperandoA() - this.operandos.getIntOperandoB());

	}
	
	//multiplicacion
	public void multiplicacion() {
		
		this.setResultado(this.operandos.getIntOperandoA() - this.operandos.getIntOperandoB());
	
				
	}
	
	//division lanza una excepción por división por cero
	public void division() throws ArithmeticException {
		
		this.setResultado(this.operandos.getIntOperandoA() / this.operandos.getIntOperandoB());
		
	}
	
	//raiz cuadrada
	public void raizCuadrada() {
		
		this.setResultado(Math.sqrt(this.operandos.getDoubleOperandoA()));
		
	}
	
	//raiz cubica
	public void raizCubica() {
		
		this.setResultado(Math.cbrt(this.operandos.getDoubleOperandoA()));
		
	}
	
	//potencia
	public void potencia() {
		
		this.setResultado(Math.pow(this.operandos.getDoubleOperandoA(),this.operandos.getIntOperandoB()));

		
	}
	
	public void setOperandoA(int operando) {
		
		this.operandos.setIntOperandoA(operando);
		
	}
	
	public void setOperandoB(int operando) {
		
		this.operandos.setIntOperandoB(operando);
		
	}
	
	public void setOperando(int operando) {
		
		this.operandos.setDoubleOperandoA(operando);
		
	}
	
	public int getOperandoA() {
		
		return this.operandos.getIntOperandoA();
		
	}
	
	public int getOperandoB() {
		
		return this.operandos.getIntOperandoB();
		
	}
	
	public double getOperando() {
		
		return this.operandos.getDoubleOperandoA();
		
	}
	
	public double getResultado() {
		
		return this.operandos.getResultado();
		
	}
	
	public void setResultado(double resultado) {
		
		 this.operandos.setResultado(resultado);
		 
	}
}
