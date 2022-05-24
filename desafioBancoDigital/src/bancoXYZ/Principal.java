package bancoXYZ;


public class Principal {
	public static void main(String[] args) {
		//colocando valores na conta poupança
		contaPoupanca cp = new contaPoupanca();
		Cliente c1 = new Cliente();
		c1.setNomeCliente("Alisson");
		cp.setClienteConta(c1);
		cp.setIdConta("1");
		cp.setSaldoConta(0.0);
		cp.setDiaRendimento(24);
		
		cp.depositar(200.0);//deposito
		
		System.out.println(cp);
		
		rendimentoConta(cp);
		
		contaSaque(cp, 200);
		
		System.out.println(cp);
		
		contaSaque(cp, 200);;//saque nao é possivel, sem valor na conta
		
		contaSaque(cp, 200);;//saque não é possivel, sem valor na conta
		
		cp.depositar(5000);
		
		System.out.println(cp);//impressao do extrato da conta
		
		rendimentoConta(cp);
		
		cp.depositar(-5); //tentando passar um valor negativo para testar o metodo depositar
		
		//conta corrente com o mesmo cliente
		contaCorrente cc = new contaCorrente();
		cc.setClienteConta(c1);
		cc.setIdConta("1");
		cc.setSaldoConta(0.0);
		cc.setLimite(2000);
		
		System.out.println(cc);
		
		contaSaque(cc, 100); //testando saque conta com limite
		
		System.out.println(cc);
		
		transferencia(cp, cc, 500);//transferencia conta poupança a conta corrente
		
		System.out.println(cp);
		System.out.println(cc);
	}
	
	//metodo para controle de qual conta vai ser sacado valores
	public static void contaSaque(Conta conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso= " + conta.getSaldoConta());
		} else {
			System.out.println("Saque não efetuado, sem saldo");
		}
	}
	
	//metodo para verificar o rendimento da conta poupança
	public static void rendimentoConta(contaPoupanca cp) {
		if(cp.calcularRendimento(0.1)) {
			System.out.println("Rendimento da conta realizado: " + cp.getSaldoConta());
		}else {
			System.out.println("Novo saldo não reajustado, não é dia de rendimento");
		}
	}
	
	//metodo para transferencia de valores
	public static void transferencia(Conta conta1, Conta conta2, double valor) {
		if(conta1.getSaldoConta() > 0) {
				conta1.setSaldoConta(conta1.getSaldoConta()-valor);
				conta2.setSaldoConta(conta2.getSaldoConta()+valor);
				System.out.println("Transferência realizada");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}
		
}
	


