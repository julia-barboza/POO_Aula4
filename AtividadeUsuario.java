package POO4;

public class AtividadeUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		usuario.setID(122);
		usuario.setNome("Júlia Barboza");
		usuario.setPermissao("0 (usuário comum)");
		usuario.setSenha(2211);
		usuario.setUsuario("julia_barboza");

		System.out.println(usuario.getNome());
		System.out.println(usuario.getUsuario());
		System.out.println(usuario.getID());
		System.out.println(usuario.getSenha());
		System.out.println(usuario.getPermissao());

		usuario.login();
		usuario.mostrarPermissao();
		usuario.alterarSenha(3344);
		usuario.logout();

	}

}
