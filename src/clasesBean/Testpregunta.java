package clasesBean;
// Generated 24-abr-2018 8:35:34 by Hibernate Tools 5.2.3.Final

/**
 * Testpregunta generated by hbm2java
 */
public class Testpregunta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTestPregunta;
	private Test test;
	private Preguntas pregunta;
	private long puntuacionPregunta;

	public Testpregunta() {
	}

	public Testpregunta(int idTestPregunta, Test test, Preguntas pregunta, long puntuacionPregunta) {
		this.idTestPregunta = idTestPregunta;
		this.test = test;
		this.pregunta = pregunta;
		this.puntuacionPregunta = puntuacionPregunta;
	}

	public int getIdTestPregunta() {
		return this.idTestPregunta;
	}

	public void setIdTestPregunta(int idTestPregunta) {
		this.idTestPregunta = idTestPregunta;
	}

	public long getPuntuacionPregunta() {
		return this.puntuacionPregunta;
	}

	public void setPuntuacionPregunta(long puntuacionPregunta) {
		this.puntuacionPregunta = puntuacionPregunta;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Preguntas getPregunta() {
		return pregunta;
	}

	public void setPregunta(Preguntas pregunta) {
		this.pregunta = pregunta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}