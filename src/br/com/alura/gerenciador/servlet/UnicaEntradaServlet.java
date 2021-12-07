package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		if (paramAcao.equals("ListaEmpresas")) {
			System.out.println("Listando empresas acao");
			
			ListaEmpresas lista = new ListaEmpresas();
			lista.executa(request, response);
		} else if (paramAcao.equals("RemoveEmpresa")) {
		
			RemoveEmpresa remove = new RemoveEmpresa();
			remove.executa(request, response);
		} else if (paramAcao.equals("MostraEmpresa")) {
			
			MostraEmpresa mostra = new MostraEmpresa();
			mostra.executa(request, response);
		}
		else if(paramAcao.equals("AlteraEmpresa")) {
			AlteraEmpresa altera = new AlteraEmpresa();
			altera.executa(request, response);
		}else if(paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa nova = new NovaEmpresa();
			nova.executa(request, response);
		}
	}
}
