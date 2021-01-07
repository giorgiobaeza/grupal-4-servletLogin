package modelo;

public class Capacitacion {

	private int idCapacitacion;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private int capDuracion;
	
	public Capacitacion(int idCapacitacion, String capFecha, String capHora, String capLugar, int capDuracion) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.capFecha = capFecha;
		this.capHora = capHora;
		this.capLugar = capLugar;
		this.capDuracion = capDuracion;
	}

	public Capacitacion() {
		super();
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getCapFecha() {
		return capFecha;
	}

	public void setCapFecha(String capFecha) {
		this.capFecha = capFecha;
	}

	public String getCapHora() {
		return capHora;
	}

	public void setCapHora(String capHora) {
		this.capHora = capHora;
	}

	public String getCapLugar() {
		return capLugar;
	}

	public void setCapLugar(String capLugar) {
		this.capLugar = capLugar;
	}

	public int getCapDuracion() {
		return capDuracion;
	}

	public void setCapDuracion(int capDuracion) {
		this.capDuracion = capDuracion;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", capFecha=" + capFecha + ", capHora=" + capHora
				+ ", capLugar=" + capLugar + ", capDuracion=" + capDuracion + "]";
	}
	
	
}
