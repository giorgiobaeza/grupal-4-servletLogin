package modelo;

public class Profesional {
	
	private int run;
	private String nombre;
	private String apellido;
	private int telefono;
	private String tituloProfesional;
	private String proyecto;
	private int usuarioRun;
	
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
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
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public int getUsuarioRun() {
		return usuarioRun;
	}
	public void setUsuarioRun(int usuarioRun) {
		this.usuarioRun = usuarioRun;
	}
	
	@Override
	public String toString() {
		return "Profesional [run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", tituloProfesional=" + tituloProfesional + ", proyecto=" + proyecto + ", usuarioRun=" + usuarioRun
				+ "]";
	}
	
	public Profesional(int run, String nombre, String apellido, int telefono, String tituloProfesional, String proyecto,
			int usuarioRun) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.tituloProfesional = tituloProfesional;
		this.proyecto = proyecto;
		this.usuarioRun = usuarioRun;
	}
	
	public Profesional() {
		super();
	}
	

}
