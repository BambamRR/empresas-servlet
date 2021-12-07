package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static int idChaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(idChaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(idChaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(idChaveSequencial++);
		Banco.lista.add(empresa);
	}

	public Empresa buscaEmpresaPeloId(int id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
//		throw new NoSuchElementException("Nenhuma empresa com esse ID encontrada");
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				it.remove();
			}
		}
	}
}
