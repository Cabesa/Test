package clasesBean;
// Generated 24-abr-2018 8:35:34 by Hibernate Tools 5.2.3.Final

import java.util.Set;

/**
 * Test generated by hbm2java
 */
public class Test implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTest;
	private String nombreTest;
	private String codigoTest;
	private Profesores profesor;
	private Temas tema;
	private Set <Testalumno> testalumnos;
	private Set <Testpregunta> testpreguntas;

	public Test() {
	}

	public Test(String nombreTest, String codigoTest, Profesores profesor, Temas tema) {
		this.nombreTest = nombreTest;
		this.codigoTest = codigoTest;
		this.profesor = profesor;
		this.tema = tema;
	}
	public Test(int idTest, String nombreTest, String codigoTest, Profesores profesor, Temas tema) {
		this.idTest = idTest;
		this.nombreTest = nombreTest;
		this.codigoTest = codigoTest;
		this.profesor = profesor;
		this.tema = tema;
	}

	public Integer getIdTest() {
		return this.idTest;
	}

	public void setIdTest(Integer idTest) {
		this.idTest = idTest;
	}

	public String getNombreTest() {
		return this.nombreTest;
	}

	public void setNombreTest(String nombreTest) {
		this.nombreTest = nombreTest;
	}

	public String getCodigoTest() {
		return this.codigoTest;
	}

	public void setCodigoTest(String codigoTest) {
		this.codigoTest = codigoTest;
	}

	public Profesores getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

	public Temas getTema() {
		return tema;
	}

	public void setTema(Temas tema) {
		this.tema = tema;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set <Testalumno> getTestalumnos() {
		return testalumnos;
	}

	public void setTestalumnos(Set <Testalumno> testalumnos) {
		this.testalumnos = testalumnos;
	}

	public Set<Testpregunta> getTestpreguntas() {
		return testpreguntas;
	}

	public void setTestpreguntas(Set<Testpregunta> testpreguntas) {
		this.testpreguntas = testpreguntas;
	}

	

}