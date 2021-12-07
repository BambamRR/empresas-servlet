package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class TestModelMethods {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		Empresa info = banco.buscaEmpresaPeloId(2);
		
		System.out.println(info);
	}

}
