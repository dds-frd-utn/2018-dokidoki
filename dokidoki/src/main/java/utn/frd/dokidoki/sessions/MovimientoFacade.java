/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frd.dokidoki.sessions;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import utn.frd.dokidoki.entity.Movimiento;

/**
 *
 * @author Fedora
 */
@Stateless
public class MovimientoFacade extends AbstractFacade<Movimiento> {

    @PersistenceContext(unitName = "utn.frd_dokidoki_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovimientoFacade() {
        super(Movimiento.class);
    }

    public List<Movimiento> findLastMovements(long id) {
        return em.createNamedQuery("Movimiento.findByIdCuentaOrdered").setParameter("idCuenta", id).setMaxResults(10).getResultList();
    }

    public List<Movimiento> findAllOfCuentaWithEstado(long id, long estado) {
        return em.createNamedQuery("Movimiento.findByIdCuentaByEstado").setParameter("idCuenta", id).setParameter("estado", estado).getResultList();
    }

    public Object getSaldo(long id) {
        return em.createNamedQuery("Movimiento.getSaldo").setParameter("idCuenta", id).getSingleResult();
    }
    
}
