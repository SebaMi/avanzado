package clase1;

import modelo.Employee;
import servicio.GestorEmpleados;

public class MainClass {

	public static void main(String[] args) {
		Employee presidente = GestorEmpleados.createEmployee(100, "Presidente", "presidencia");
		
		Employee jefeSenado = GestorEmpleados.createEmployee(200, "Jefe Senado", "senado");
		GestorEmpleados.establecerJerarquia(jefeSenado, presidente);
		GestorEmpleados.generarEmpleados(jefeSenado);
		
		Employee jefeDiputado = GestorEmpleados.createEmployee(300,"Jefe Diputado", "congreso");
		GestorEmpleados.establecerJerarquia(jefeDiputado, presidente);
		GestorEmpleados.generarEmpleados(jefeDiputado);
		
	}
	
//	private static Manager createManager(String nombre, String ubicacion, int legajo){
//	Manager man = new Manager();
//	man.setLegajo(legajo);
//	man.setName(nombre);
//	man.setUbicacion(ubicacion);
//	
//	return man;
//}
	
//	private static int generarRandomInt(int minimo, int maximo) {
//		Random generadorRandom = new Random();
//		int cantidad = generadorRandom.nextInt(maximo);
//		while(cantidad < minimo) {
//			cantidad = generadorRandom.nextInt(maximo);
//		}
//		
//		return cantidad;
//	}
	
	
//	private static List<Employee> generateRandomEmployees(int cantidad, String nombreBase, int legajoBase, Manager report){
//		List<Employee> employees = new ArrayList<Employee>();
//		Employee emp = null;
//		for (int i = 1; i <= cantidad; i++) {
//			emp = new Employee();
//			emp.setLegajo(legajoBase + i);
//			emp.setName(nombreBase+emp.getLegajo());
//			emp.setUbicacion(report.getUbicacion());
//			emp.setReportTo(report);
//			employees.add(emp);
//		}
//		
//		return employees;
//	}

	

}
