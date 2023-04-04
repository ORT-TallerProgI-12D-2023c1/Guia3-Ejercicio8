package ejercicio8;

public class EmpleadoConSalarioFijo extends Empleado{
	private int sueldoBasico;
	public EmpleadoConSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, int sueldoBasico) {
		super(dni,nombre,apellido,anioIngreso);
		this.sueldoBasico = sueldoBasico;
	}
	


	private double porcSegunAntiguedad() {
		int antiguedad = getAntiguedad();
		double porcentaje;
		if (antiguedad < 2) {
			porcentaje = 0;
		} else if(antiguedad <= 5) {
			porcentaje = 0.05;
		}
		else if(antiguedad <= 10) {
			porcentaje = 0.1;
		}
		else {
			porcentaje = 0.15;
		}
		return porcentaje;
	}
	
	private double sueldoPorAntiguedad() {
		return sueldoBasico * porcSegunAntiguedad();
	}
	
	@Override
	public double obtenerSalario() {
		return sueldoBasico + sueldoPorAntiguedad();
	}
	
}
