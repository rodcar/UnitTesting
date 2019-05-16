package pe.edu.upc.ivanrodriguez.operaciones;

public class OperacionesMatematicas {

	public double suma(double a , double b) {
		return a + b;
	}
	
	public double resta(double a, double b) {
		return a -b;
	}	
	
	public double multiplicacion(double a, double b) {
		return a * b;
	}
	
	public double division(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("división por cero");
		}
		return a / b;
	}
}
