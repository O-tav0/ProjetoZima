package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.com.entidade.Pedido;
import br.com.DAO.ManterPedido;

public final class formAcompanhaPedidoAdministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/MenuAdministrador.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Acompanhamento de Pedidos</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                \r\n");
      out.write("                margin:0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .cabecalho {\r\n");
      out.write("                background-color: #2d2c28;\r\n");
      out.write("                padding:5px;\r\n");
      out.write("                border-bottom: 3px solid #f5f4f3;\r\n");
      out.write("                position:relative;\r\n");
      out.write("                margin:0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .logo {\r\n");
      out.write("                position:relative;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                margin-left:0px;\r\n");
      out.write("                top: -48px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .menu {\r\n");
      out.write("                position:relative;\r\n");
      out.write("                margin-left: 250px;\r\n");
      out.write("                margin-top:-60px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            li {\r\n");
      out.write("                display:inline-block;\r\n");
      out.write("                color: #798b52;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            a {\r\n");
      out.write("                display:inline-block;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                color:#798b52;\r\n");
      out.write("                margin:0;\r\n");
      out.write("                padding:0;\r\n");
      out.write("            }\r\n");
      out.write("            li>a:hover {\r\n");
      out.write("                color:#f5f4f3;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .dadosLogados {\r\n");
      out.write("                float:right;\r\n");
      out.write("                color: #798b52;\r\n");
      out.write("                font-family: 'Nanum Brush Script', cursive;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            .emailLogado {\r\n");
      out.write("                margin-right: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            //String emailLogado = (String) String.valueOf(session.getAttribute("email"));
            //String codigoUsuario = (String) String.valueOf(session.getAttribute("codigoUsuario"));
            
        
      out.write("\r\n");
      out.write("        <header class=\"cabecalho\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"formAcompanhaPedidoAdministrador.jsp\">\r\n");
      out.write("                    <img src=\"LogoSemFundo.png\" alt=\"Logo\" width=\"250px\" height=\"150px\" />\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav class=\"menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"formAlteraProduto.jsp\">Cardápio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"formAcompanhaPedidoAdministrador.jsp\">Pedidos</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <div class=\"dadosLogados\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"logout.jsp\"> <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-door-open\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path d=\"M8.5 10c-.276 0-.5-.448-.5-1s.224-1 .5-1 .5.448.5 1-.224 1-.5 1z\"/>\r\n");
      out.write("                                            <path d=\"M10.828.122A.5.5 0 0 1 11 .5V1h.5A1.5 1.5 0 0 1 13 2.5V15h1.5a.5.5 0 0 1 0 1h-13a.5.5 0 0 1 0-1H3V1.5a.5.5 0 0 1 .43-.495l7-1a.5.5 0 0 1 .398.117zM11.5 2H11v13h1V2.5a.5.5 0 0 0-.5-.5zM4 1.934V15h6V1.077l-6 .857z\"/>\r\n");
      out.write("                                        </svg> Sair </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                            <table class=\"table table-striped\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">Número do pedido:</th>\r\n");
      out.write("      <th scope=\"col\">Data</th>\r\n");
      out.write("      <th scope=\"col\">Valor</th>\r\n");
      out.write("      <th scope=\"col\">Status</th>\r\n");
      out.write("      <th scope=\"col\"></th>\r\n");
      out.write("      <th scope=\"col\"></th>\r\n");
      out.write("      <th scope=\"col\"></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("            ");
 
            String vcodigo="";
            String vvalor="";
            String vdata="";
            String vcep="";
            String vbairro="";
            String vrua="";
            String vnumero="";
            String vref="";
            String vstatus="";
            
            ManterPedido dao = new ManterPedido();
            Pedido p = new Pedido();
            
            ArrayList<Pedido> pedido = dao.pesquisarTudo();
            for (int i = 0; i < pedido.size(); i++) {
                p = pedido.get(i);
                vcodigo=String.valueOf(p.getCodigo());
                vvalor=String.valueOf(p.getValor());
                vdata=String.valueOf(p.getData());
                vcep=String.valueOf(p.getCepEntrega());
                vbairro=String.valueOf(p.getBairroEntrega());
                vrua=String.valueOf(p.getRuaEntrega());
                vnumero=String.valueOf(p.getNumeroEntrega());
                vref=String.valueOf(p.getpRefEntrega());
                vstatus=String.valueOf(p.getStatus());
            
      out.write("\r\n");
      out.write("            <form action=\"AlteraStatus\" method=\"POST\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th scope=\"row\"><input type=\"hidden\" name=\"codigo\" value=\"");
      out.print(vcodigo);
      out.write('"');
      out.write('>');
      out.print(vcodigo);
      out.write("</th></input>\r\n");
      out.write("              <td>");
      out.print(vdata);
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print(vvalor);
      out.write("</td>\r\n");
      out.write("              <td><select name=\"status\" id=\"status\">\r\n");
      out.write("                      <option value=\"P\">Pendente</option>\r\n");
      out.write("                      <option value=\"F\">Fazendo</option>\r\n");
      out.write("                      <option value=\"A\">A caminho</option>\r\n");
      out.write("                      <option value=\"E\">Entregue</option>\r\n");
      out.write("                  </select></td>\r\n");
      out.write("                  <td><button class=\"btn btn-primary\" type=\"submit\">Alterar</button></td>\r\n");
      out.write("              <td>\r\n");
      out.write("                   <a class=\"btn btn-danger\" href=\"DeletaPedido?codigo=");
      out.print(vcodigo);
      out.write("\" onclick=\"return confirm('Confirma exclusão do pedido ");
      out.print(vcodigo);
      out.write("?')\">Excluir</a>   \r\n");
      out.write("              </td>\r\n");
      out.write("              <td><a class=\"btn btn-info\" href=\"buscaPedidoDetalhado?codigoPed=");
      out.print(vcodigo);
      out.write("\">Detalhes</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                        ");
 }
                        
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
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
