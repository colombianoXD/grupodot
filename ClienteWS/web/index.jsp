<%-- 
    Document   : index
    Created on : 4/12/2019, 08:12:13 PM
    Author     : desarrollo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prueba de Carlos Gaviria!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	prueba.webservices.ServiceSocio_Service service = new prueba.webservices.ServiceSocio_Service();
	prueba.webservices.ServiceSocio port = service.getServiceSocioPort();
	 // TODO initialize WS operation arguments here
	double montoSolicitado = 0.0d;
	// TODO process result here
	prueba.webservices.Cotizacion result = port.generarCotizacion(montoSolicitado);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <form action="index.jsp" method="post"/>
    <table border="1">
        <thead>
            <tr>
                <th>monto :</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="text" name="montoSolicitado"  size="50" required /></td>
            </tr>
        <td colspan="2"> <input type="submit" values="Enviar"/></td>
        </tbody>
    </table>


    </body>
</html>
