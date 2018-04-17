/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.dokidoki.rest.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import utn.frd.dokidoki.entity.Cuenta;
import utn.frd.dokidoki.sessions.CuentaFacade;
/**
 *
 * @author Sergio
 */
@Path("/Cuenta")
public class CuentaRest {
    @EJB
    private CuentaFacade ejbCuentaFacade;
    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cuenta> findAll(){
        return ejbCuentaFacade.findAll();
    }
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Cuenta Cuenta){
        ejbCuentaFacade.create(Cuenta);
    }
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Cuenta Cuenta){
        ejbCuentaFacade.edit(Cuenta);
    }
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejbCuentaFacade.remove( ejbCuentaFacade.find(id) );
    }
    //obtener una entidad por id
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Cuenta findById(@PathParam("id")long id){
        return ejbCuentaFacade.find(id);
    }
}