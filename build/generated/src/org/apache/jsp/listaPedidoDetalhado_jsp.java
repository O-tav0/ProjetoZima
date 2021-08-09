package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.entidade.Produto;
import br.com.DAO.ManterProduto;
import br.com.entidade.ItemPedido;
import br.com.DAO.ManterItensPedido;
import java.util.ArrayList;
import br.com.entidade.Pedido;
import br.com.DAO.ManterPedido;

public final class listaPedidoDetalhado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Pedido Detalhado</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
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
      out.write("        \r\n");
      out.write("        <section>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                            <table class=\"table table-striped\">\r\n");
      out.write("  <thead>\r\n");
      out.write("      ");

            //Recebendo dados da Tabela Pedido
            String vcodigo=String.valueOf(request.getParameter("codigoPed"));
            String vcodigoCli=String.valueOf(request.getAttribute("codigoCli"));
            String vvalor=String.valueOf(request.getAttribute("valor"));
            String vdata=String.valueOf(request.getAttribute("data"));
            String vcep=String.valueOf(request.getAttribute("cep"));
            String vbairro=String.valueOf(request.getAttribute("bairro"));
            String vrua=String.valueOf(request.getAttribute("rua"));
            String vnumero=String.valueOf(request.getAttribute("numero"));
            String vref=String.valueOf(request.getAttribute("pRef"));
            String vstatus=String.valueOf(request.getAttribute("status"));
            String vlocal=String.valueOf(request.getAttribute("local"));
            
            //Recebendo dados da Tabela Cliente
            String vnome=String.valueOf(request.getAttribute("nome"));
            
            //Recebendo dados da Tabela Itens Pedido
//            String viditem=String.valueOf(request.getAttribute("id_item"));
//            String vqtd=String.valueOf(request.getAttribute("qtde"));
//            String vbebida=String.valueOf(request.getAttribute("tipo_bebida"));
//            String vqtdbebida=String.valueOf(request.getAttribute("qtde_bebida"));
            
            //Recebendo dados da Tabela Produto
//            String vtitulo=String.valueOf(request.getAttribute("titulo"));
            
            //Recebendo dados da Tabela Pagamento
            String vforma=String.valueOf(request.getAttribute("forma"));
            String vstatusPag=String.valueOf(request.getAttribute("status"));
           
            
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">Número do pedido: ");
      out.print(vcodigo);
      out.write("</th>\r\n");
      out.write("      <th scope=\"col\">Cliente: ");
      out.print(vnome);
      out.write("</td>\r\n");
      out.write("      <th scope=\"col\">Data: ");
      out.print(vdata);
      out.write("</th>\r\n");
      out.write("      <td>Valor: ");
      out.print(vvalor);
      out.write("</td>\r\n");
      out.write("      <td>Status: ");
      out.print(vstatus);
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td><h4>Endereço de entrega:</h4></td>\r\n");
      out.write("              <td>Cep: ");
      out.print(vcep);
      out.write("</td>\r\n");
      out.write("              <td>Bairro: ");
      out.print(vbairro);
      out.write("</td>\r\n");
      out.write("              <td>Rua: ");
      out.print(vrua);
      out.write("</td>\r\n");
      out.write("              <td>Número: ");
      out.print(vnumero);
      out.write("</td>\r\n");
      out.write("              <td>Ponto de Referência: ");
      out.print(vref);
      out.write("</td>\r\n");
      out.write("              <td>Localização: ");
      out.print(vlocal);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                int codigoPedido = Integer.valueOf(request.getParameter("codigoPed")) ;
                
                Produto prod = new Produto();
                ManterProduto daoprod = new ManterProduto();
                ItemPedido ip = new ItemPedido();
                ManterItensPedido daoip = new ManterItensPedido();
                ArrayList<ItemPedido> itens = daoip.pesquisarTudo(codigoPedido);
                for (int i = 0; i < itens.size(); i++) {
                    ip = itens.get(i);
                                int codigo = ip.getCod_produto();
                                prod = daoprod.pesquisar(codigo);
                                String vtitulo=String.valueOf(prod.getTitulo());
                    String vqtd=String.valueOf(ip.getQtde());
                    String vbebida=String.valueOf(ip.getBebida());
                    String vqtdbebida=String.valueOf(ip.getQtdeBebida());
                
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Item: ");
      out.print(vtitulo);
      out.write("</td>\r\n");
      out.write("                <td>QTD: ");
      out.print(vqtd);
      out.write("</td>\r\n");
      out.write("                <td>Bebida: ");
      out.print(vbebida);
      out.write("</td>\r\n");
      out.write("                <td>QTD Bebida: ");
      out.print(vqtdbebida);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Forma de pagamento: ");
      out.print(vforma);
      out.write("</td>\r\n");
      out.write("                <td>Status: ");
      out.print(vstatus);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                           </div>\r\n");
      out.write("                </div>\r\n");
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
