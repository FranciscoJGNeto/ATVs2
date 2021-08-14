import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Pessoa {
	String nome;
	String dataNascimento;
	BigDecimal altura;
	int idade;

	public String getNome() {
		return this.nome;
	}
	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getDataNascimento(){
		return this.dataNascimento;
	}
	public String setDataNascimento(String data){
		return this.dataNascimento = data;
	}

	public BigDecimal getAltura() {
		return this.altura;
	}
	public BigDecimal setAltura(BigDecimal altura) {
		return this.altura = altura;
	}

	public void calculaIdade() {
		int anoNascimento = Integer.parseInt(this.dataNascimento.substring(0,4));

		Calendar cal = GregorianCalendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		this.idade = anoAtual - anoNascimento;
	}

	public String toString(){

		String dados = "Nome: " + this.nome + "\nData Nascimento: " + this.dataNascimento + "\nAltura: " + this.altura;

		if(this.idade == 0) {
			dados += "";
		} else {
			dados += "\nIdade: " + this.idade;
		}
		
		return dados;
	}

}