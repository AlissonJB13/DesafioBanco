package bancoXYZ;

public class Cliente {
	
	private int idCliente;
	private String nomeCliente;
	
	private Cliente(int idCliente, String nomeCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
	}
	
	public String toString() {
		return "\nId do Cliente: " + this.getIdCliente() +
				"\nNome: " + this.getNomeCliente();
	}

	public static class clienteBuilder{
		private int idCliente;
		private String nomeCliente;
		
		public clienteBuilder(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		
		public clienteBuilder idCliente(int idCliente) {
			this.idCliente = idCliente;
			return this;
		}
		
		public clienteBuilder nomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
			return this;
		}
		
		public Cliente criarCliente() {
			return new Cliente(idCliente, nomeCliente);
		}
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	/*public String toString() {
		return "\nId do Cliente: " + this.getIdCliente() +
				"\nNome: " + this.getNomeCliente();
	}*/
	
}
