package br.edu.ufsj.ccomp.tecweb.services;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Path("/text/plain/{nome}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayTextPlainHello(@PathParam("nome") String nome){
		return "Hello TecWeb - " + nome;
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello(){
		return "<html> " + "<title>" + "Hello Jersey" +" </title>"
                + "<body><h1>" + "Hello Tecweb" + "</body></h1>" + "</html>" ;
	}
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@POST
	@Path("/adicionar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> adicionar(Usuario usuario){
		usuarios.add(usuario);
		return usuarios;
	}
	
}
