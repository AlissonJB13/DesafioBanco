package bancoXYZ;

public class Conta {
	private String idConta;
	private Cliente clienteConta;
	private double saldoConta = 0.0;
	
	public String getIdConta() {
		return idConta;
	}
	public void setIdConta(String idConta) {
		this.idConta = idConta;
	}
	
	public Cliente getClienteConta() {
		return clienteConta;
	}
	public void setClienteConta(Cliente clienteConta) {
		this.clienteConta = clienteConta;
	}

	
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	@Override
	//exibicao dos dados
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n            BANCO XYZ"   +
				"\n-------- Dados Bancários --------\n"
				+ "\nNome do Cliente: " + clienteConta.getNomeCliente()+
				  "\nNúmero conta: " + idConta +
				  "\nSaldo: " + saldoConta;
	}
	
	//metodo depositar
	public void depositar(double valor) {
		if(valor > 0) {
		saldoConta = saldoConta + valor;
		System.out.println("Deposito realizado com sucesso");
		} else {
			System.out.println("Operação invalida");
		}
	}
	
	//metodo sacar
	public boolean sacar(double valor) {
		if((saldoConta-valor)>=0) {
			saldoConta = saldoConta - valor;
			//System.out.println("Saque realizado com sucesso");
			return true;
		}else {
			//System.out.println("Saldo insuficiente");
			return false;
		}
	}
}