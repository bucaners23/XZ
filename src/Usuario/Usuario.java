package Usuario;

public class Usuario {

	String Correo;
	String Contraseña;
	public Usuario() {
		
	}
	public Usuario(String correo, String contraseña) {
		super();
		Correo = correo;
		Contraseña = contraseña;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	
}
