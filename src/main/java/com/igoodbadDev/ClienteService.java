package com.igoodbadDev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteService {

	private static Map<Integer,Cliente> clientes = new HashMap<>();
	
	static {
		Cliente luis = new Cliente("s4232","Luis","Perez","González","totocod2@gmail.com");
		Cliente clau = new Cliente("9vwee","Claudia","Perez","Gerrero","ivonesue@hotmail.com");
		
		clientes.put(1, luis);
		clientes.put(2, clau);
	}
	
	/**
	 * Metodo para retornr la lista de todos los clientes registrados
	 * @return ArrayList
	 */
	@GET
	public List<Cliente> getClientes(){
		return new ArrayList<Cliente>(clientes.values());
	}
	
	/**
	 * Metodo para registrar un cliente
	 * @param cliente
	 * @return void
	 */
	@POST
	public void addCliente(Cliente cliente) {
		clientes.put(clientes.size()+1, cliente);
	}
	
	/**
	 * Metodo para actualizar un cliente
	 * @param cliente
	 * @return void
	 */
	@PUT
	@Path("/{clienteId}")
	public void updateCliente(@PathParam("clienteId") int id,Cliente cliente) {
		/*this.folio = folio;
		this.nombre = nombre;
		this.appPat = appPat;
		this.appMat = appMat;
		this.email = email;*/
	}
	
	/**
	 * Metodo para eliminar un cliente
	 * @param id
	 * @return void
	 */
	@DELETE
	@Path("/{clienteId}")
	public void deleteCliente(@PathParam("clienteId") int id) {
		clientes.remove(id);
	}
}
