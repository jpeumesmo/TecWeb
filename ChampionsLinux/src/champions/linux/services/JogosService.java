package champions.linux.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import champions.linux.services.entities.Jogo;

@Path("/jogos")
public class JogosService {

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Jogo> listarJogos() {
		return BD.instance().TBJOGOS;
	}
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Jogo> addJogo(Jogo jogo){
		BD.instance().addJogo(jogo);
		return BD.instance().TBJOGOS;
	}
}
