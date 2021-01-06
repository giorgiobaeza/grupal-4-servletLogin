package modelo;

public class Profesional {
	
	private int run;
	private String nombre;
	private String apellido;
	private int telefono;
	private String tituloProfesional;
	private int proyecto;
	
	@Override
	public String toString() {
		return "Profesional [run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", tituloProfesional=" + tituloProfesional + ", proyecto=" + proyecto + "]";
	}

	public int getrun() {
		return run;
	}

	public void setrun(int run) {
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public int getProyecto() {
		return proyecto;
	}

	public void setProyecto(int proyecto) {
		this.proyecto = proyecto;
	}

	public Profesional() {
		super();
	}

	public Profesional(int run, String nombre, String apellido, int telefono, String tituloProfesional,
			int proyecto) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.tituloProfesional = tituloProfesional;
		this.proyecto = proyecto;
	}
	
	
}
