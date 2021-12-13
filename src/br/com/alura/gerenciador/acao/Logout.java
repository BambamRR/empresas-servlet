package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		//sessao.removeAttribute("usuarioLogado"); //remove apenas o atributo usuarioLogado
		sessao.invalidate(); //remove todos os atributuos atribuidos durante a sessao realizada, carrinho de compras e informaçoes de usuario
		
		return "foward:entrada?acao=LoginForm";
	}

}
