/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.dokidoki.rest.services;

import java.util.ArrayList;
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
import utn.frd.dokidoki.entity.Movimiento;
import utn.frd.dokidoki.sessions.MovimientoFacade;
/**
 *
 * @author Sergio
 */
@Path("/movimiento")
public class MovimientoRest {
    @EJB
    private MovimientoFacade ejbMovimientoFacade;
    //obtener todas las entidades
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Movimiento> findAll(){
        return ejbMovimientoFacade.findAll();
    }
    //crear entidades
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Movimiento movimiento){
        ejbMovimientoFacade.create(movimiento);
    }
    //actualizar entidades
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public void edit(@PathParam("id")long id, Movimiento movimiento){
        ejbMovimientoFacade.edit(movimiento);
    }
    //eliminar entidades
    @DELETE
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Path("/{id}")
    public void remove(@PathParam("id")long id){
        ejbMovimientoFacade.remove( ejbMovimientoFacade.find(id) );
    }
    //obtener los ultimos 10 movimientos de una cuenta
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Movimiento> findById(@PathParam("id")long id){
        List<Movimiento> movimientos = ejbMovimientoFacade.findAll();
        List<Movimiento> aux = new ArrayList<>();
        for (Movimiento movimiento : movimientos) {
            if (movimiento.getIdCuenta() != id) {
                aux.add(movimiento);
            }
        }
        movimientos.removeAll(aux);
        return movimientos.subList(Math.max(0, movimientos.size()-10), movimientos.size());
    }
}