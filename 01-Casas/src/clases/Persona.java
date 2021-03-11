package clases;

public class Persona {
	private String nombre;
	private int edad;
	private String tlf;
	private Direccion direccion;
	private String dni;

	public Persona(String nombre, int edad, String tlf, Direccion direccion, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tlf = tlf;
		this.direccion = direccion;
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return nombre + ", tiene " + edad + " años, su tlf es el " + tlf + ", vive en " + direccion + ", con dni "
				+ dni;
	}

}
