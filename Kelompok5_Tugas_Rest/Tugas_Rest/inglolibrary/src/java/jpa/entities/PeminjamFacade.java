/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kentry R D
 */
@Stateless
public class PeminjamFacade extends AbstractFacade<Peminjam> {

    @PersistenceContext(unitName = "inglolibraryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeminjamFacade() {
        super(Peminjam.class);
    }
    
}
