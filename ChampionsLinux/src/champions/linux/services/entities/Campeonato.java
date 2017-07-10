package champions.linux.services.entities;

import java.util.ArrayList;

public class Campeonato {
	
	//ATRIBUTOS
	private Administrador administrador;
	private ArrayList<Jogo> jogos;
	
	
	//METODOS
	
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public ArrayList<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}
	
	
	
}
