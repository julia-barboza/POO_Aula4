package POO4;

public class AtividadeFornecedor {

	public static void main(String[] args) {

		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setId("124");
		fornecedor.setRazaoSocial("Serviço Social da Indústria - CE124");
		fornecedor.setNomeFantasia("SESI Itapetininga");
		fornecedor.setCnpj("03.779.133/0019-25");
		fornecedor.setEndereco("Rua Bruno Emanuel Fregona, 277 - Centro, Itapetininga - SP");
		fornecedor.setFone("(15) 3275-7920");
		fornecedor.setEmail("suitapetininga@sesisp.org.br");
		fornecedor.setInscricaoEstadual("Isento");

		System.out.println(fornecedor.getId());
		System.out.println(fornecedor.getRazaoSocial());
		System.out.println(fornecedor.getNomeFantasia());
		System.out.println(fornecedor.getCnpj());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getFone());
		System.out.println(fornecedor.getEmail());
		System.out.println(fornecedor.getInscricaoEstadual());
		
		fornecedor.fornecerProduto("Cadeiras de Escritório");
        fornecedor.atualizarEndereco("Av. Brasil, 500 - Itapetininga - SP");
        fornecedor.enviarEmail("Sua entrega será realizada amanhã.");
        fornecedor.mostrarContato();
	}

}
