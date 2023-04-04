package ejercicio8;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		empleados = new ArrayList<>();
	}
	
	public void agregarEmpleado(Empleado e) {
		if(e != null) {
			empleados.add(e);
		}
	}
	
	public void mostrarSalarios() {
		System.out.println(String.format("EMPRESA: %s", nombre));
		System.out.printf("Empleados:");
		for(Empleado e : empleados) {
			e.mostrarDatos();
		}
	}
	
	public EmpleadoAComision empleadoConMasClientes() {
		int maxClientes = -1;
		EmpleadoAComision empleadoConMasClientes = null;
		EmpleadoAComision empleadoComisionActual;
		int cantActualClientes;
		for(Empleado e : empleados) {
			if (e instanceof EmpleadoAComision) {
				empleadoComisionActual = (EmpleadoAComision) e;
				cantActualClientes = empleadoComisionActual.getClientesCaptados();
				if(cantActualClientes > maxClientes) {
					empleadoConMasClientes = empleadoComisionActual;
					maxClientes = cantActualClientes;
				}
			}
		}		
		return empleadoConMasClientes;
	}
	
}
