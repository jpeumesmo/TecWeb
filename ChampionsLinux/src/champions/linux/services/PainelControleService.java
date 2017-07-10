package champions.linux.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import champions.linux.services.entities.Mensagem;

@Path("/painelcontrole")
public class PainelControleService {
	
	@GET
	@Path("/mensagens/obter")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mensagem> obterMensagens() {
		return BD.instance().TBMENSAGENS;
		
	}

}
