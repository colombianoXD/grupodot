package prueba.model;
// Generated 4/12/2019 07:19:03 PM by Hibernate Tools 4.3.1



/**
 * Prestamo generated by hbm2java
 */
public class Prestamo  implements java.io.Serializable {


     private int ididSocio;
     private String socio;
     private double tasa;
     private String maximo;

    public Prestamo() {
    }

    public Prestamo(int ididSocio, String socio, double tasa, String maximo) {
       this.ididSocio = ididSocio;
       this.socio = socio;
       this.tasa = tasa;
       this.maximo = maximo;
    }
   
    public int getIdidSocio() {
        return this.ididSocio;
    }
    
    public void setIdidSocio(int ididSocio) {
        this.ididSocio = ididSocio;
    }
    public String getSocio() {
        return this.socio;
    }
    
    public void setSocio(String socio) {
        this.socio = socio;
    }
    public double getTasa() {
        return this.tasa;
    }
    
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }
    public String getMaximo() {
        return this.maximo;
    }
    
    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }




}


