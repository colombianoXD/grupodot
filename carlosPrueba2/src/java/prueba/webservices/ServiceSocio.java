/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.webservices;


import java.text.DecimalFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import prueba.dao.ConsultaPrestamo;

import prueba.dao.PrestamoDAO;
import prueba.dto.Cotizacion;
import prueba.model.Prestamo;


//import prueba.dao.*;

/**
 *
 * @author desarrollo
 */
@WebService(serviceName = "ServiceSocio")
public class ServiceSocio {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ConsultarSocioNombre")
    public String ConsultarSocioNombre(@WebParam(name = "nombre") String nombre) {
        ConsultaPrestamo p = new ConsultaPrestamo();
        return p + " "+ p.consultarSocio(nombre) + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "generarCotizacion")
    public Cotizacion generarCotizacion(@WebParam(name = "montoSolicitado") double montoSolicitado) {
        
       Cotizacion cotizacion = new Cotizacion();
       PrestamoDAO prestamoDAO = new PrestamoDAO();
       Prestamo prestamo = prestamoDAO.consultarSocioDisponible(montoSolicitado); 
       
       if (prestamo != null){
            DecimalFormat formatter = new DecimalFormat("#0.00");
            double valorCuotaMensual;
            double VF;//Valor Futuro
            double VA = montoSolicitado;//Valor Actual
            double i = prestamo.getTasa();//Tasa de interés
            float porcentajeInteres = (float) (i/100);
            int n = 36;//Periodo de tiempo 

            VF = VA * (1 + n * porcentajeInteres);
            valorCuotaMensual = VF/n;
            System.out.println("TASA INTERES: "+i);
            System.out.println("PORCENTAJE "+porcentajeInteres);
            System.out.println("VALOR FUTURO: "+formatter.format(VF));
            System.out.println("VALOR CUOTA MENSUAL: "+formatter.format(valorCuotaMensual));
            
            cotizacion.setNombreSocio(prestamo.getSocio());
            cotizacion.setPagoTotalCredito(formatter.format(VF));
            cotizacion.setTasaInteres(""+prestamo.getTasa());
            cotizacion.setValorCuotaMensual(formatter.format(valorCuotaMensual));
            
            cotizacion.setCodigoRespuesta("000");
            cotizacion.setMensajeRespuesta("Cotización realizada exitosamente.");
       }
        
        return cotizacion;
    }
  
    
}


