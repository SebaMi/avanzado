package clase1;

import java.util.List;

public class Manager extends Employee {
	private List<Employee> listaEmpleados = null;

	List<Employee> getListaEmpleados() {
		return listaEmpleados;
	}

	void setListaEmpleados(List<Employee> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
}
