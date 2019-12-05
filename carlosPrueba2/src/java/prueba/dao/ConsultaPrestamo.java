/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.dao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import prueba.dto.HibernateUtil;
import prueba.model.Prestamo;

/**
 *
 * @author desarrollo
 */
public class ConsultaPrestamo {
    public String consultarSocio(String nombre){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Prestamo prestamo = (Prestamo) session.get(Prestamo.class, nombre);
        if (prestamo != null){
            return " Informacion del nombre "+ nombre+ " Nombre es " + prestamo.getSocio() + " Tasa : "+ + prestamo.getTasa() + "% " + " Maximo "+ prestamo.getMaximo();
        }
        else {
            return "el nombre :" + nombre +" No existe" ;
        }
        
    }
    public List<Prestamo> verPrestamo(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createQuery("from Prestamo");
        List<Prestamo> Lista = query.list();
        sesion.close();
        return Lista;
        
    } 
    
    
    
}
