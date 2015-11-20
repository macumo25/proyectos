<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page import = "façade.CustomerFaçade"%>
<%@page import = "pojo.Customer"%>
<%@page import = "java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--% response.sendRedirect("index.htm"); %-->

<html>
    <head><title>Hola Customer</title></head>
    <body>
        <h1>Customers</h1>
        
        <%
            façade.CustomerFaçade customerFaçade = new CustomerFaçade();
            List<Customer> customers = customerFaçade.getListaClientes();
        %>
        <% for (Customer c: customers){ %>
        <p> <%=c.getName() %> </p>
        <%}%>
        
        <p>Nombre</p>
    </body>
        
</html>
