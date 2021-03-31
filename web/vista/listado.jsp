

<%@page import="com.emergentes.modelo.LibroDAO"%>
<%@page import="com.emergentes.modelo.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            LibroDAO lista =(LibroDAO) session.getAttribute("gestor");
        %>
        <h1>Listado</h1>
        <p><a href="../Principal?op=nuevo">Nuevo</a></p>
        <%
            if(lista.getLibros().size()>0)
            {       
        %>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Titulo</th>
                <th>Autor</th>
                <th>Estado</th>
                <th></th>
                <th></th>
            </tr>
        <%
                for (Libro item : lista.getLibros())
                {       
        %>
             <tr>
                <th><%= item.getId() %></th>
                <th><%= item.getTitulo() %></th>
                <th><%= item.getAutor() %></th>
                <th><%= item.getEstado() %></th>
                <th><a href="../Principal?op=editar&id=<%=item.getId() %>">Editar</a></th>
                <th><a href="../Principal?op=eliminar&id=<%=item.getId() %>" onclick="return(confirm('Esta seguro de eliminar??'))">Eliminar</a></th>
            </tr>           
                
        <%
                }
        
        %>
        
        </table>
        <%
            }    
            else
            {
                    out.println("<p>No existe registro</p>");

            }
        %>
    </body>
</html>
