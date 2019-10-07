package br.com.fernando;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TarefasDAO tarefadao = new TarefasDAO();
		
		UsuariosDAO usuariodao = new UsuariosDAO();
		
		Tarefas t1 = new Tarefas();
		t1.setDescricao("LISTAR");
		t1.setCodigousuario(1);
		
		Usuarios u1 = new Usuarios();
		u1.setUsuario("FERNANDO");
		
		usuariodao.insert(u1);
		tarefadao.insert(t1);
		
		System.out.println(tarefadao.getByCodigotarefa(4));
		
		System.out.println(usuariodao.getByCodigousuario(1));
		
		
		for (Usuarios usuario: usuariodao.getAll()) {
			System.out.print(usuario);
		}
		
		for (Tarefas tarefa : tarefadao.getAll()) {
			System.out.print(tarefa);
		}

	}

}
