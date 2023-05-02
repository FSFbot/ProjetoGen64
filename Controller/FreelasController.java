package Controller;

import Repositorio.UsuarioRepositorio;
import freelas.freelancers;

import java.util.ArrayList;

public class FreelasController implements UsuarioRepositorio {

	private ArrayList<freelancers> listaUsuarios = new ArrayList<freelancers>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var usuario = buscarNaCollection(numero);

		if (usuario != null) {
			usuario.visualizar();
		} else {
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
		}
	}

	

	@Override
	public void acessarTodos() {
		for (var usuario : listaUsuarios) {
			usuario.visualizar();
		}

	}

	@Override
	public void cadastrar(freelancers usuario) {
		listaUsuarios.add(usuario);
		System.out.println("\nUsuario Criado com sucesso!!!\n\nO seu número de ID é: " + usuario.getNumero()
				+ "!!! \nSalve esse ID, pois ele será necessário para acessar suas informações!!!");
	}

	@Override
	public void atualizar(freelancers usuario) {
		var buscaUsuario = buscarNaCollection(usuario.getNumero());

		if (buscaUsuario != null) {
			listaUsuarios.set(listaUsuarios.indexOf(buscaUsuario), usuario);
			System.out.println("\nO usuario: " + usuario.getNumero() + " Foi atualizado. Parabéns, uhuuu!!!");
		} else {
			System.out.println("\nID não encontrado! Digite uma opção válida.");
		}

	}

	@Override
	public void deletar(int numero) {
		var usuario = buscarNaCollection(numero);

		if (usuario != null) {
			if (listaUsuarios.remove(usuario) == true)
				System.out.println("\nO Usuário de ID: " + numero + " foi excluido!");
		} else
			System.out.println("\nID  " + numero + " não foi encontrada!");

	}

	public int gerarNumero() {
		return ++numero;

	}

	public freelancers buscarNaCollection(int numero) {
		for (var usuario : listaUsuarios) {
			if (usuario.getNumero() == numero) {
				return usuario;
			}
		}
		return null;
	}

	public ArrayList<freelancers> getListaUsuarios() {
		return listaUsuarios;
	}
}
