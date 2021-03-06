package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class ListaEmpresas implements Acao{

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("listando empresas");

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
//        HttpSession sessao = request.getSession();
//        if( sessao.getAttribute("usuarioLogado") == null) {
//        	return "redirect:entrada?acao=LoginForm";
//        }
        lista.sort((e1, e2) -> {
        	return e1.getNome().compareTo(e2.getNome());
        });

        request.setAttribute("empresas", lista);

        return "forward:listaEmpresas.jsp";
    }

}
