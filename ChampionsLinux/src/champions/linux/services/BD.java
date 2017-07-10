package champions.linux.services;

import java.util.ArrayList;
import java.util.List;

import champions.linux.services.entities.Administrador;
import champions.linux.services.entities.Jogador;
import champions.linux.services.entities.Jogo;
import champions.linux.services.entities.Mensagem;
import champions.linux.services.entities.Time;
import champions.linux.services.entities.Usuario;

public class BD {
	
	public List<Jogo> TBJOGOS;
	public List<Mensagem> TBMENSAGENS;
	public List<Time> tbEquipes = new ArrayList<>();
	private List<Usuario> tbUsuario = new ArrayList<>();
	
	private static BD bd;
	
	private BD() {
		
		//USUARIOS
		this.tbUsuario.add(new Administrador("joaopmoferreira@gmail.com","123"));
		
		//EQUIPES
		this.tbEquipes.add(new Time("Bigode Grosso",1));
		this.tbEquipes.add(new Time("Calouros",2));
		this.tbEquipes.add(new Time("Hora Extra",3));
		this.tbEquipes.add(new Time("Vice da Gama",4));
		
		//JOGADORES
		ArrayList<Jogador> jogadores = new ArrayList<>();
		jogadores.add(new Jogador("Elder", 5));
		jogadores.add(new Jogador("Douglas", 6));
		jogadores.add(new Jogador("Madeira",1));
		jogadores.add(new Jogador("Edmilson",10));
		jogadores.add(new Jogador("Marcos",8));
		this.tbEquipes.get(0).setJogadores(jogadores);;
	}
	
	public static BD instance() {
		
		if ( bd == null ) {
			bd = new BD();
		}
		
		return bd;
	}
	
	public List<Usuario> usuarios() {
		return this.tbUsuario;
	}
	
	public void addTime(Time t){
		this.tbEquipes.add(t);
	}
	
	public List<Time> times() {
		return this.tbEquipes;
	}
}
