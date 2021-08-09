package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formCadastroProdutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Cadastrar Produtos</title>\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                background-color:#798b52;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            .logo {\r\n");
      out.write("                display: block;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                margin-left: 650px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .fundoJumbotron {\r\n");
      out.write("               background-color:#798b52;\r\n");
      out.write(";              margin-left: 350px;\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("            .jumbotromMeu {\r\n");
      out.write("                background-color:#798b52;\r\n");
      out.write("                size: 450px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .fonte {\r\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\r\n");
      out.write("                color: #dfb649;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            input {\r\n");
      out.write("                border-radius: 15px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding:2px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .botaoEnviar{\r\n");
      out.write("                width:535px;\r\n");
      out.write("                background-color:#dfb649;\r\n");
      out.write("                color: #2d2c28;\r\n");
      out.write("                border-radius: 20px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                box-shadow: 3px  3px #2d2c28;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            <div class=\"container fundoJumbotron\">\r\n");
      out.write("                <form action=\"CadastrarProduto\" method=\"POST\">\r\n");
      out.write("                    <h1> Cadastro de Produto </h1> <br/>\r\n");
      out.write("                    <div id=\"DadosPessoais\" class=\"divSecaoFormulario\">\r\n");
      out.write("                        <label> Título: </label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Título\" size=\"30\" maxlength=\"60\" name=\"titulo\">\r\n");
      out.write("                        <label> Descrição: </label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Descrição\" maxlength=\"500\" name=\"descricao\">\r\n");
      out.write("                        <label> Preço: </label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Preço\" maxlength=\"60\" size=\"28px\" name=\"preco\">\r\n");
      out.write("                        <label>Imagem:</label>\r\n");
      out.write("                        <input type=\"file\" placeholder=\"Anexe a imagem\" size=\"15px\" name=\"imagem\">\r\n");
      out.write("                        <button type=\"submit\" class=\"botaoEnviar\"> Cadastrar </button>\r\n");
      out.write("                        <button type=\"reset\" class=\"botaoEnviar\"> Limpar </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
