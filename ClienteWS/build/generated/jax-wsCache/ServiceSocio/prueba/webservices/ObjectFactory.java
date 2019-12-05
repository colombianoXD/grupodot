
package prueba.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the prueba.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerarCotizacion_QNAME = new QName("http://webservices.prueba/", "generarCotizacion");
    private final static QName _ConsultarSocioNombre_QNAME = new QName("http://webservices.prueba/", "ConsultarSocioNombre");
    private final static QName _ConsultarSocioNombreResponse_QNAME = new QName("http://webservices.prueba/", "ConsultarSocioNombreResponse");
    private final static QName _GenerarCotizacionResponse_QNAME = new QName("http://webservices.prueba/", "generarCotizacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: prueba.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarCotizacion }
     * 
     */
    public GenerarCotizacion createGenerarCotizacion() {
        return new GenerarCotizacion();
    }

    /**
     * Create an instance of {@link ConsultarSocioNombreResponse }
     * 
     */
    public ConsultarSocioNombreResponse createConsultarSocioNombreResponse() {
        return new ConsultarSocioNombreResponse();
    }

    /**
     * Create an instance of {@link ConsultarSocioNombre }
     * 
     */
    public ConsultarSocioNombre createConsultarSocioNombre() {
        return new ConsultarSocioNombre();
    }

    /**
     * Create an instance of {@link GenerarCotizacionResponse }
     * 
     */
    public GenerarCotizacionResponse createGenerarCotizacionResponse() {
        return new GenerarCotizacionResponse();
    }

    /**
     * Create an instance of {@link Cotizacion }
     * 
     */
    public Cotizacion createCotizacion() {
        return new Cotizacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.prueba/", name = "generarCotizacion")
    public JAXBElement<GenerarCotizacion> createGenerarCotizacion(GenerarCotizacion value) {
        return new JAXBElement<GenerarCotizacion>(_GenerarCotizacion_QNAME, GenerarCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSocioNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.prueba/", name = "ConsultarSocioNombre")
    public JAXBElement<ConsultarSocioNombre> createConsultarSocioNombre(ConsultarSocioNombre value) {
        return new JAXBElement<ConsultarSocioNombre>(_ConsultarSocioNombre_QNAME, ConsultarSocioNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSocioNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.prueba/", name = "ConsultarSocioNombreResponse")
    public JAXBElement<ConsultarSocioNombreResponse> createConsultarSocioNombreResponse(ConsultarSocioNombreResponse value) {
        return new JAXBElement<ConsultarSocioNombreResponse>(_ConsultarSocioNombreResponse_QNAME, ConsultarSocioNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCotizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.prueba/", name = "generarCotizacionResponse")
    public JAXBElement<GenerarCotizacionResponse> createGenerarCotizacionResponse(GenerarCotizacionResponse value) {
        return new JAXBElement<GenerarCotizacionResponse>(_GenerarCotizacionResponse_QNAME, GenerarCotizacionResponse.class, null, value);
    }

}
