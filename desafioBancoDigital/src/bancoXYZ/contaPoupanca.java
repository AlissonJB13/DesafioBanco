package bancoXYZ;

import java.util.Calendar;

public class contaPoupanca extends Conta {
		private int diaRendimento;

		public int getDiaRendimento() {
			return diaRendimento;
		}

		public void setDiaRendimento(int diaRendimento) {
			this.diaRendimento = diaRendimento;
		}
		
	@Override
	//mostrar os resultados
	public String toString() {
		return "\n         Conta Poupança" +
				super.toString() +
			   "\nDia de Rendimento: " + diaRendimento;
	}
	
	//metodo de calculo do rendimento da conta com base no dia
	public boolean calcularRendimento(double taxaRendimento) {
		Calendar dia = Calendar.getInstance();
		
		if(diaRendimento == dia.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldoConta(this.getSaldoConta() + (this.getSaldoConta()*taxaRendimento));
			return true;
		}return false;
	}
}


