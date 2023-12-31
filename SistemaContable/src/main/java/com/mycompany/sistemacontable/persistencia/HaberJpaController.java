/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.persistencia;

import com.mycompany.sistemacontable.modelo.Haber;
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
public class HaberJpaController implements Serializable {

    public HaberJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public HaberJpaController(){
        emf = Persistence.createEntityManagerFactory("joyeriaJPAPU");
    }
    

    public void create(Haber haber) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(haber);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Haber haber) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            haber = em.merge(haber);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = haber.getId();
                if (findHaber(id) == null) {
                    throw new NonexistentEntityException("The haber with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
     public List<Haber> getList(){
        EntityManager em =  null;
        
        em = getEntityManager();
        String jsql = "SELECT ha FROM Haber ha";
        Query query = em.createQuery(jsql, Haber.class);
        List<Haber> lista = query.getResultList();
        return lista;
    }
    
    

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Haber haber;
            try {
                haber = em.getReference(Haber.class, id);
                haber.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The haber with id " + id + " no longer exists.", enfe);
            }
            em.remove(haber);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Haber> findHaberEntities() {
        return findHaberEntities(true, -1, -1);
    }

    public List<Haber> findHaberEntities(int maxResults, int firstResult) {
        return findHaberEntities(false, maxResults, firstResult);
    }

    private List<Haber> findHaberEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Haber.class));
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

    public Haber findHaber(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Haber.class, id);
        } finally {
            em.close();
        }
    }

    public int getHaberCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Haber> rt = cq.from(Haber.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
