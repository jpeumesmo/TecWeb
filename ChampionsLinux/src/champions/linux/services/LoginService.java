package champions.linux.services;


import java.net.URI;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import champions.linux.services.entities.Administrador;
import champions.linux.services.entities.Usuario;

@Path("/login")
public class LoginService {


	@POST
	@Path("/logar")
	public Response logar(@FormParam("email") String email, @FormParam("password") String password){
		Usuario user = new Usuario(email,password);
		
		for ( Usuario usuario : BD.instance().usuarios() ) {
			if ( usuario.equals(user) ) {
				if ( usuario instanceof Administrador ) {
					return Response.seeOther(URI.create("/ChampionsLinux/Administracao/index.html")).build();
				}
				return Response.seeOther(URI.create("/ChampionsLinux/Administracao/index.html")).build();
			}
		}
		
		return null;
	}

}
