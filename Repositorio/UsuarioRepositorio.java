package Repositorio;

import freelas.freelancers;


public interface UsuarioRepositorio {

	public void procurarPorNumero(int numero);
	public void acessarTodos();
	public void cadastrar(freelancers usuario);
	public void atualizar(freelancers usuario);
	public void deletar(int numero);
	
}
