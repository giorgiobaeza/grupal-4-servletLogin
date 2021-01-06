package modelo;

public class Administrativo {

	private int run;
	private String nombre;
	private String apellido;
	private String email;
	private String area;
	private int usuarioRun;
	
	public Administrativo() {
		super();
	}

	public Administrativo(int run, String nombre, String apellido, String email, String area, int usuarioRun) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.area = area;
		this.usuarioRun = usuarioRun;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getUsuarioRun() {
		return usuarioRun;
	}

	public void setUsuarioRun(int usuarioRun) {
		this.usuarioRun = usuarioRun;
	}

	@Override
	public String toString() {
		return "Administrativo [run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", area=" + area + ", usuarioRun=" + usuarioRun + "]";
	}
	
	
	
}
