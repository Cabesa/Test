package clasesBean;

import java.util.Set;

// Generated 24-abr-2018 8:35:34 by Hibernate Tools 5.2.3.Final

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private String nombreUsuario;
	private String apellido1usuario;
	private String apellido2usuario;
	private String passUsuario;
	private String emailUsuario;
	private Set <Alumnos> alumnos;
	private Set <Profesores> profesores;

	public Usuarios() {
	}

	public Usuarios(String nombreUsuario, String apellido1usuario, String apellido2usuario, String passUsuario,
			String emailUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.apellido1usuario = apellido1usuario;
		this.apellido2usuario = apellido2usuario;
		this.passUsuario = passUsuario;
		this.emailUsuario = emailUsuario;
	}
	public Usuarios(int idUsuario, String nombreUsuario, String apellido1usuario, String apellido2usuario, String passUsuario,
			String emailUsuario) {
		this.idUsuario =idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellido1usuario = apellido1usuario;
		this.apellido2usuario = apellido2usuario;
		this.passUsuario = passUsuario;
		this.emailUsuario = emailUsuario;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellido1usuario() {
		return this.apellido1usuario;
	}

	public void setApellido1usuario(String apellido1usuario) {
		this.apellido1usuario = apellido1usuario;
	}

	public String getApellido2usuario() {
		return this.apellido2usuario;
	}

	public void setApellido2usuario(String apellido2usuario) {
		this.apellido2usuario = apellido2usuario;
	}

	public String getPassUsuario() {
		return this.passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Set<Alumnos> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<Profesores> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesores> profesores) {
		this.profesores = profesores;
	}
	

}