package modelo;

public class Contacto {

	private String contNombre;
	private String ContCorreoElectronico;
	private String ContTelefono;
	private String ContMensaje;
	
	public String getContNombre() {
		return contNombre;
	}

	public void setContNombre(String contNombre) {
		this.contNombre = contNombre;
	}

	public String getContCorreoElectronico() {
		return ContCorreoElectronico;
	}

	public void setContCorreoElectronico(String contCorreoElectronico) {
		ContCorreoElectronico = contCorreoElectronico;
	}

	public String getContTelefono() {
		return ContTelefono;
	}

	public void setContTelefono(String contTelefono) {
		ContTelefono = contTelefono;
	}

	public String getContMensaje() {
		return ContMensaje;
	}

	public void setContMensaje(String contMensaje) {
		ContMensaje = contMensaje;
	}

	@Override
	public String toString() {
		return "Contacto [contNombre=" + contNombre + ", ContCorreoElectronico=" + ContCorreoElectronico
				+ ", ContTelefono=" + ContTelefono + ", ContMensaje=" + ContMensaje + "]";
	}

	public Contacto() {
		super();
	}

	public Contacto(String contNombre, String contCorreoElectronico, String contTelefono, String contMensaje) {
		super();
		this.contNombre = contNombre;
		ContCorreoElectronico = contCorreoElectronico;
		ContTelefono = contTelefono;
		ContMensaje = contMensaje;
	}
	
	
}
