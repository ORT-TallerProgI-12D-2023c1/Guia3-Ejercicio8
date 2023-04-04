package ejercicio8;

public class Test {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("Maravilla S.A");
		
		//Agregar Empleado Salario Fijo
		agregarEmpleadoSalarioFijo(empresa,1111,"Lionel","Messi",2010,10000);
		agregarEmpleadoSalarioFijo(empresa,1112,"Angel","DiMaria",2006,20000);
		agregarEmpleadoSalarioFijo(empresa,1113,"Dibu","Martinez",2019,30000);
		
		//Agregar Empleado Comision
		agregarEmpleadoComision(empresa, 2221, "Enzo", "Fernandez", 2020, 100,100);
		agregarEmpleadoComision(empresa, 2222, "Roberto", "Fernandez", 2021, 30,200);
		agregarEmpleadoComision(empresa, 2223, "Raul", "Fernandez", 2012, 400,1000);
		agregarEmpleadoComision(empresa, 2224, "Pedor", "Fernandez", 2013, 200,50);
		
		empresa.mostrarSalarios();
		
		System.out.println("\n\n---------------------------------------\n");
		
		System.out.println("EMPLEADO COMISION CON MAS CLIENTES:");
		EmpleadoAComision empleadoConMasClientes = empresa.empleadoConMasClientes();
		empleadoConMasClientes.mostrarDatos();
		
		System.out.println("\n\n---------------------------------------\n");
		
	}

	private static void agregarEmpleadoSalarioFijo(Empresa empresa, int dni, String nombre, String apellido, int anioIngreso, int sueldoBasico) {
		empresa.agregarEmpleado(new EmpleadoConSalarioFijo(dni,nombre,apellido,anioIngreso,sueldoBasico));
	}
	
	private static void agregarEmpleadoComision(Empresa empresa, int dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCliente) {
		empresa.agregarEmpleado(new EmpleadoAComision(dni,nombre,apellido,anioIngreso,clientesCaptados,montoPorCliente));
	}
	
}
