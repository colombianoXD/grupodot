/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.dao;

import java.util.List;
import org.hibernate.Session;
import prueba.dto.HibernateUtil;
import prueba.model.Prestamo;

/**
 *
 * @author desarrollo
 */
public class PrestamoDAO {
    
    private Session session;
    
    public Prestamo consultarSocioDisponible(double montoSolicitado){
        try{
            String montoSolicitar = montoSolicitado+"";
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Prestamo> lista = session.createQuery("SELECT p FROM Prestamo p WHERE p.maximo > :montoSolicitado ORDER BY p.tasa ASC")
                    .setParameter("montoSolicitado", montoSolicitar).list();
            session.getTransaction().commit();
            session.close();
            if (!lista.isEmpty()) {
                return lista.get(0);
            }
        }catch(Exception e){
            System.err.println("Cotizaciones: ERROR al intentar listar los socios.");
            e.printStackTrace();
        }
        return null;
    }
    
}
