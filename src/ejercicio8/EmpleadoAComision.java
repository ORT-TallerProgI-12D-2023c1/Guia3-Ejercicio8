package ejercicio8;

public class EmpleadoAComision extends Empleado {
	private static final int SALARIO_MIN = 20000;
	private double montoPorCliente;
	private int clientesCaptados;
	
	public EmpleadoAComision(int dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCliente) {
		super(dni,nombre,apellido,anioIngreso);
		this.clientesCaptados = clientesCaptados;
		this.montoPorCliente = montoPorCliente;
	}

	public int getClientesCaptados() {
		return clientesCaptados;
	}
	
	private double obtenerMontoPorClientes() {
		return this.clientesCaptados * montoPorCliente;
	}
	
	@Override
	public double obtenerSalario() {
		double salario = obtenerMontoPorClientes();
		if(salario < SALARIO_MIN) {
			salario = SALARIO_MIN;
		}
		return salario;
	}	
	
}
