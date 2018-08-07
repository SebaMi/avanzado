package clase1;

import java.util.ArrayList;
import java.util.List;

public class AvanzadoRepaso {

	public static void main(String[] args) {
		Manager presidente = contratarManager(100,100,"Presidencia", "Presidente de todos y todas");
		
		Manager jefeSenado = contratarManager(200,200,"Senado", "Jefe de Senadores");
		
		Manager jefeDiputados = contratarManager(300,300,"Congreso", "Jefe de Diputados");
		
		presidente.setListaEmpleados(new ArrayList<Employee>());
		presidente.getListaEmpleados().add(jefeDiputados);
		presidente.getListaEmpleados().add(jefeSenado);
		
		jefeSenado.setListaEmpleados(new ArrayList<Employee>());
		jefeDiputados.setListaEmpleados(new ArrayList<Employee>());
		
		
		
		System.out.println("asdas");
		
	}
	
	public static Manager contratarManager(int legajo, int departamento, String ubicacion, String name) {
		Manager m = new Manager();
		m.setLegajo(legajo);
		m.setDepartamento(departamento);
		m.setUbicacion(ubicacion);
		m.setName(name);
		
		return m;
	}
	
	public static Employee contratarEmpleado(int legajo, int departamento, String ubicacion) {
		Employee emp = new Employee();
		emp.setLegajo(legajo);
		emp.setDepartamento(departamento);
		emp.setUbicacion(ubicacion);
		switch(ubicacion) {
			case "Senado":
				emp.setName("senado"+legajo);
				break;
			case "Congreso":
				emp.setName("diputado"+legajo);
				break;
		}
		return emp;
	}
	
	public static List<Employee> generarListaEmpleados(int cantidad, String nombre, String ubicacion) {
		List<Employee> lista = new ArrayList<Employee>();
		for(int i=0; i<cantidad;i++) {
			Employee 
		}
		return lista;
	}
	
	public static void mostrar () {
		
	}

}
