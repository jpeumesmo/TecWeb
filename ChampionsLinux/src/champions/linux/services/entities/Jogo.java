package champions.linux.services.entities;

import java.util.Date;

public class Jogo {

	//ATRIBUTOS
	private Time timeMandandte;	
	private Time timeVisitante;
	private Sumula sumula;
	private String informacao;
	private Date dataInicio;
	private Date dataTermino;

	//METODOS
	public Jogo(){
		
	}
	public Time getTimeMandandte() {
		return timeMandandte;
	}
	public void setTimeMandandte(Time timeMandandte) {
		this.timeMandandte = timeMandandte;
	}
	public Time getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Sumula getSumula() {
		return sumula;
	}
	public void setSumula(Sumula sumula) {
		this.sumula = sumula;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	
}
