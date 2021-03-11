package clases;

import java.util.ArrayList;

public class Casa {
	private double m2;
	private ArrayList<Habitacion> habitaciones;
	private Persona dueño;
	private Direccion direccion;
	private ArrayList<Persona> inquilino;
	private double precio;

	public Casa(double m2, ArrayList<Habitacion> habitaciones, Persona dueño, Direccion direccion,
			ArrayList<Persona> inquilino, double precio) {
		super();
		this.m2 = m2;
		this.habitaciones = habitaciones;
		this.dueño = dueño;
		this.direccion = direccion;
		this.inquilino = inquilino;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getInquilino() {
		return inquilino;
	}

	public void setInquilino(ArrayList<Persona> inquilino) {
		this.inquilino = inquilino;
	}

	@Override
	public String toString() {
		return "La casa tiene " + m2 + "m2, " + habitaciones + ".\nSu dueño es " + dueño + ".\nLa casa se encuentra en "
				+ direccion + ".\nSus inquilinos son " + inquilino + ".\nTiene un precio es de " + precio + "€";
	}

}
