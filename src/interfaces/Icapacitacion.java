package interfaces;

import java.util.List;

import modelo.Capacitacion;

public interface Icapacitacion {

	public List<Capacitacion> obtenerCapacitacion();
	public boolean  crearCapacitacion(Capacitacion cap);
	
}
