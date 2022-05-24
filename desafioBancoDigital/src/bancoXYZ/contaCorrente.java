package bancoXYZ;

public class contaCorrente extends Conta {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//exibicao
	public String toString() {
		return "\n         Conta Corrente" +
				super.toString() +
			   "\nLimite: " + limite;
	}
	
	//polimorfismo do metodo sacar
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldoConta() + limite;
		if((saldoComLimite-valor)>=0) {
			this.setSaldoConta(this.getSaldoConta()-valor);
			return true;
		}
		return false;
	}
	
}
