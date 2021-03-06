package clasesBean;
// Generated 24-abr-2018 8:35:34 by Hibernate Tools 5.2.3.Final

import java.util.Set;

/**
 * Preguntas generated by hbm2java
 */
public class Preguntas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPregunta;
	private String descPregunta;
	private Tipopregunta tipopregunta;
	private Set <Testpregunta> testpreguntas;
	private Set <Respuestas> respuestas;

	public Preguntas() {
	}

	public Preguntas(String descPregunta, Tipopregunta tipopregunta) {
		this.descPregunta = descPregunta;
		this.tipopregunta = tipopregunta;
	}
	public Preguntas(int idPregunta, String descPregunta, Tipopregunta tipopregunta) {
		this.idPregunta = idPregunta;
		this.descPregunta = descPregunta;
		this.tipopregunta = tipopregunta;
	}

	public Integer getIdPregunta() {
		return this.idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getDescPregunta() {
		return this.descPregunta;
	}

	public void setDescPregunta(String descPregunta) {
		this.descPregunta = descPregunta;
	}


	public Set<Testpregunta> getTestpreguntas() {
		return testpreguntas;
	}

	public void setTestpreguntas(Set<Testpregunta> testpreguntas) {
		this.testpreguntas = testpreguntas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Tipopregunta getTipopregunta() {
		return tipopregunta;
	}

	public void setTipopregunta(Tipopregunta tipopregunta) {
		this.tipopregunta = tipopregunta;
	}

	public Set <Respuestas> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Set <Respuestas> respuestas) {
		this.respuestas = respuestas;
	}

	

}
