package ejercicio8;

import java.time.LocalDate;

public abstract class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;
	
	public Empleado(int dni, String nombre, String apellido, int anioIngreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}
	
	public int getAntiguedad() {
		return LocalDate.now().getYear() - anioIngreso;
	}
	
	public abstract double obtenerSalario();
	
	public String nombreCompleto() {
		return nombre + " " + apellido;
	}
	
	public void mostrarDatos() {
		System.out.println(toString());
		//System.out.printf("NOMBRE COMPLETO: %s\nSalario: %f\n", nombreCompleto(), obtenerSalario());
		//System.out.println("NOMBRE COMPLETO: " + nombreCompleto() + "\nSalario: " + obtenerSalario());
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", anioIngreso=" + anioIngreso
				+ ", salario = " + obtenerSalario() + "]";
	}
	
	
	
}
