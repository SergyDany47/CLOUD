package clases;

public class Habitacion {
	private double m2;
	private String tipo;
	private int num;

	public Habitacion(double m2, String tipo, int num) {
		super();
		this.m2 = m2;
		this.tipo = tipo;
		this.num = num;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "La habitacion tiene " + m2 + "m2, es un " + tipo + ", y son " + num;
	}

}
