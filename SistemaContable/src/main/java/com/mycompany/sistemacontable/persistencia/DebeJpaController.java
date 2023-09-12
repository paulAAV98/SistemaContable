/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.persistencia;

import com.mycompany.sistemacontable.modelo.Debe;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class DebeJpaController implements Serializable {

    public DebeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public DebeJpaController(){
        emf = Persistence.createEntityManagerFactory("joyeriaJPAPU");
    }

    public void create(Debe debe) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(debe);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Debe debe) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            debe = em.merge(debe);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = debe.getId();
                if (findDebe(id) == null) {
                    throw new NonexistentEntityException("The debe with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Debe> getList(){
        EntityManager em =  null;
        
        em = getEntityManager();
        String jsql = "SELECT de FROM Debe de";
        Query query = em.createQuery(jsql, Debe.class);
        List<Debe> lista = query.getResultList();
        return lista;
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Debe debe;
            try {
                debe = em.getReference(Debe.class, id);
                debe.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The debe with id " + id + " no longer exists.", enfe);
            }
            em.remove(debe);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Debe> findDebeEntities() {
        return findDebeEntities(true, -1, -1);
    }

    public List<Debe> findDebeEntities(int maxResults, int firstResult) {
        return findDebeEntities(false, maxResults, firstResult);
    }

    private List<Debe> findDebeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Debe.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Debe findDebe(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Debe.class, id);
        } finally {
            em.close();
        }
    }

    public int getDebeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Debe> rt = cq.from(Debe.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
