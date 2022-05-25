package bancoXYZ;

public class testePessoa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente.clienteBuilder("Valeria").idCliente(19).criarCliente();
		System.out.println(cliente);
	}

}
