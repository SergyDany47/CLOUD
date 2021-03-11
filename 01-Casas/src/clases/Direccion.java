package clases;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String cp;

	public Direccion(String tipoVia, String nombreVia, String cp) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "la direccion " + tipoVia + " " + nombreVia + " con codigo postal " + cp;
	}
}
