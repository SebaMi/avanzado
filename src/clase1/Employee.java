package clase1;

public class Employee {
	Manager reportTo;
	private int legajo;
	private int departamento;
	private String ubicacion;
	private String name;
	
	public Employee() {
		
	}

	String getUbicacion() {
		return ubicacion;
	}

	void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	int getDepartamento() {
		return departamento;
	}

	void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	int getLegajo() {
		return legajo;
	}

	void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
