package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.emergentes.modelo.LibroDAO;
import com.emergentes.modelo.Libro;

public final class listado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            LibroDAO lista =(LibroDAO) session.getAttribute("gestor");
        
      out.write("\n");
      out.write("        <h1>Listado</h1>\n");
      out.write("        <p><a href=\"../Principal?op=nuevo\">Nuevo</a></p>\n");
      out.write("        ");

            if(lista.getLibros().size()>0)
            {       
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Titulo</th>\n");
      out.write("                <th>Autor</th>\n");
      out.write("                <th>Estado</th>\n");
      out.write("                <th></th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("        ");

                for (Libro item : lista.getLibros())
                {       
        
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                <th>");
      out.print( item.getId() );
      out.write("</th>\n");
      out.write("                <th>");
      out.print( item.getTitulo() );
      out.write("</th>\n");
      out.write("                <th>");
      out.print( item.getAutor() );
      out.write("</th>\n");
      out.write("                <th>");
      out.print( item.getEstado() );
      out.write("</th>\n");
      out.write("                <th><a href=\"../Principal?op=editar&id=");
      out.print(item.getId() );
      out.write("\">Editar</a></th>\n");
      out.write("                <th><a href=\"../Principal?op=eliminar&id=");
      out.print(item.getId() );
      out.write("\" onclick=\"return(confirm('Esta seguro de eliminar??'))\">Eliminar</a></th>\n");
      out.write("            </tr>           \n");
      out.write("                \n");
      out.write("        ");

                }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        ");

            }    
            else
            {
                    out.println("<p>No existe registro</p>");

            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
