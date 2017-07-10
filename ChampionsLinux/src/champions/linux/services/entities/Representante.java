package champions.linux.services.entities;

public class Representante extends Usuario {
	
	public Representante(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}
	//ATRIBUTOS
	Time time;
	Jogador jogador;
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	
	
}
