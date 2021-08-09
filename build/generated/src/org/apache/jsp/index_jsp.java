package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                background-color: #798b52;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                display: block;\n");
      out.write("                position: relative;\n");
      out.write("                left: 100px;\n");
      out.write("                top: -250;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .demonstracao {\n");
      out.write("                position: relative;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .imgProd {\n");
      out.write("                position: ralative;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("                opacity:75%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .imgProd:hover {\n");
      out.write("                background-color:#dfb649;\n");
      out.write("                opacity:100%;\n");
      out.write("                transition:1s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .titulo {\n");
      out.write("                width: 400px;\n");
      out.write("                margin-left: 80px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            .paragrafo {\n");
      out.write("                font-size: 2.5em;\n");
      out.write("                color: #f5f4f3;\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login {\n");
      out.write("                align-items: center;\n");
      out.write("                box-sizing: content-box;\n");
      out.write("                position: relative;\n");
      out.write("                margin-left: 1100px;\n");
      out.write("                top: -310px;\n");
      out.write("                font-size: 1.8em;\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .paragrafoLogin {\n");
      out.write("                color: #dfb649;\n");
      out.write("                font-size: 1.4em;\n");
      out.write("                margin-left: 90px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .botaoLogin {\n");
      out.write("                width:247px;\n");
      out.write("                background-color:#dfb649;\n");
      out.write("                color: #2d2c28;\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                border: none;\n");
      out.write("                box-shadow: 3px  3px #2d2c28;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .botaoTexto {\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\n");
      out.write("                font-size: 1.3em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .conteudoLogin input {\n");
      out.write("                border-radius: 15px;\n");
      out.write("                padding: 5px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .textoLinksAlternativos {\n");
      out.write("                font-size: 22px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #dfb649;\n");
      out.write("                margin-left: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .textoLinksAlternativos:hover {\n");
      out.write("                text-decoration:underline;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <div class=\"demonstracao\">\n");
      out.write("            <span class=\"imgProd\"> <img src=\"sanduiche1.jpg\" height=\"200\" width=\"395\"></span><span class=\"imgProd\"><img src=\"sanduiche2.jpg\" height=\"200\" width=\"395\"> </span><span class=\"imgProd\"><img src=\"sanduiche3.jpg\" height=\"200\" width=\"395\"> </span><span class=\"imgProd\"><img src=\"sanduiche4.jpg\" height=\"200\" width=\"398\"> </span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"titulo\"> <br/>\n");
      out.write("             <div class=\"logo\">\n");
      out.write("            <img src=\"Logo.png\" width=\"150px\" height=\"60px\">\n");
      out.write("        </div> <br/>\n");
      out.write("            <p class=\"paragrafo\">\n");
      out.write("                \"Venha conhecer o primeiro restaurante isnpirado na culinária cubana de Brasília\"\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"\" method=\"\">\n");
      out.write("                <div class=\"conteudoLogin\">\n");
      out.write("                  <p class=\"paragrafoLogin\"> Login </p> \n");
      out.write("                  <input type=\"text\" placeholder=\"Usuário\" name=\"\" size=\"30\"> <br/>\n");
      out.write("                  <input type=\"password\" placeholder=\"Senha\" name=\"\" size=\"30\"> <br/> \n");
      out.write("                  <a href=\"formCadastroClientes.jsp\" class=\"textoLinksAlternativos\"> Não possui uma conta ? Crie já! </a>  <br/>\n");
      out.write("                  <a href=\"#\" class=\"textoLinksAlternativos\"> Esqueceu sua senha ? Clique Aqui </a> \n");
      out.write("                  <button type=\"submit\" class=\"botaoLogin\"> <span class=\"botaoTexto\"> Entrar </span> </button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
