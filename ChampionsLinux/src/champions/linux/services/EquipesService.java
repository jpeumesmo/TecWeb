package champions.linux.services;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import champions.linux.services.entities.Jogador;
import champions.linux.services.entities.Time;

@Path("/equipes")
	public class EquipesService {

		@GET
		@Path("/listar")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Time> listarEquipes() {
			return BD.instance().times();
		}
		


	@GET
	@Path("/jogadores/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Jogador> jogadores(@PathParam("id") int index) {
		return BD.instance().times().get(index-1).getJogadores();
	}
	
	@GET
	@Path("/artilheiro")
	@Produces(MediaType.APPLICATION_JSON)
	public Jogador artilheiro(){	
		return BD.instance().times().get(0).getJogadores().get(0);
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Time> addTeam(Time time){
		BD.instance().addTime(time);
		return BD.instance().times();
	}

	@POST
	@Path("/adiciona_jogador/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Jogador> addJogador(@PathParam("id")int index,Jogador jogador){
		ArrayList<Jogador> jogadores = new ArrayList<>();
		jogadores = BD.instance().tbEquipes.get(index-1).getJogadores();
		jogadores.add(jogador);
		BD.instance().tbEquipes.get(index-1).setJogadores(jogadores);
		
		return jogadores;
	}
}

