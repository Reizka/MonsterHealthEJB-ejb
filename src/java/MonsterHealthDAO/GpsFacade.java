/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterHealthDAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Renny
 */
@Stateless
public class GpsFacade extends AbstractFacade<Gps> {
    @PersistenceContext(unitName = "MonsterHealthEJB-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GpsFacade() {
        super(Gps.class);
    }
    
}
