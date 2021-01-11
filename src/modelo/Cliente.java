package modelo;

public class Cliente {

	private int rutCliente;
	private String cliNombre;
	private String cliApellido;
	private String cliTelefono;
	private String cliAfp;
	private String cliSistemaSalud;
	private String cliDireccion;
	private String cliComuna;
	private int cliEdad;
	private int usuarioRun;
	
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getCliNombre() {
		return cliNombre;
	}
	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}
	public String getCliApellido() {
		return cliApellido;
	}
	public void setCliApellido(String cliApellido) {
		this.cliApellido = cliApellido;
	}
	public String getCliTelefono() {
		return cliTelefono;
	}
	public void setCliTelefono(String cliTelefono) {
		this.cliTelefono = cliTelefono;
	}
	public String getCliAfp() {
		return cliAfp;
	}
	public void setCliAfp(String cliAfp) {
		this.cliAfp = cliAfp;
	}
	public String getCliSistemaSalud() {
		return cliSistemaSalud;
	}
	public void setCliSistemaSalud(String cliSistemaSalud) {
		this.cliSistemaSalud = cliSistemaSalud;
	}
	public String getCliDireccion() {
		return cliDireccion;
	}
	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}
	public String getCliComuna() {
		return cliComuna;
	}
	public void setCliComuna(String cliComuna) {
		this.cliComuna = cliComuna;
	}
	public int getCliEdad() {
		return cliEdad;
	}
	public void setCliEdad(int cliEdad) {
		this.cliEdad = cliEdad;
	}
	public int getUsuarioRun() {
		return usuarioRun;
	}
	public void setUsuarioRun(int usuarioRun) {
		this.usuarioRun = usuarioRun;
	}
	
	@Override
	public String toString() {
		return "Cliente [rutCliente=" + rutCliente + ", cliNombre=" + cliNombre + ", cliApellido=" + cliApellido
				+ ", cliTelefono=" + cliTelefono + ", cliAfp=" + cliAfp + ", cliSistemaSalud=" + cliSistemaSalud
				+ ", cliDireccion=" + cliDireccion + ", cliComuna=" + cliComuna + ", cliEdad=" + cliEdad
				+ ", usuarioRun=" + usuarioRun + "]";
	}
	
	public Cliente(int rutCliente, String cliNombre, String cliApellido, String cliTelefono, String cliAfp,
			String cliSistemaSalud, String cliDireccion, String cliComuna, int cliEdad, int usuarioRun) {
		super();
		this.rutCliente = rutCliente;
		this.cliNombre = cliNombre;
		this.cliApellido = cliApellido;
		this.cliTelefono = cliTelefono;
		this.cliAfp = cliAfp;
		this.cliSistemaSalud = cliSistemaSalud;
		this.cliDireccion = cliDireccion;
		this.cliComuna = cliComuna;
		this.cliEdad = cliEdad;
		this.usuarioRun = usuarioRun;
	}
	
	public Cliente() {
		super();
	}

	
	
	
}
