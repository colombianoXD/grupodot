
package prueba.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreSocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagoTotalCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaInteres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorCuotaMensual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacion", propOrder = {
    "codigoRespuesta",
    "mensajeRespuesta",
    "nombreSocio",
    "pagoTotalCredito",
    "tasaInteres",
    "valorCuotaMensual"
})
public class Cotizacion {

    protected String codigoRespuesta;
    protected String mensajeRespuesta;
    protected String nombreSocio;
    protected String pagoTotalCredito;
    protected String tasaInteres;
    protected String valorCuotaMensual;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    /**
     * Define el valor de la propiedad mensajeRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRespuesta(String value) {
        this.mensajeRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSocio() {
        return nombreSocio;
    }

    /**
     * Define el valor de la propiedad nombreSocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSocio(String value) {
        this.nombreSocio = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoTotalCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoTotalCredito() {
        return pagoTotalCredito;
    }

    /**
     * Define el valor de la propiedad pagoTotalCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoTotalCredito(String value) {
        this.pagoTotalCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaInteres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Define el valor de la propiedad tasaInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaInteres(String value) {
        this.tasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCuotaMensual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorCuotaMensual() {
        return valorCuotaMensual;
    }

    /**
     * Define el valor de la propiedad valorCuotaMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorCuotaMensual(String value) {
        this.valorCuotaMensual = value;
    }

}
