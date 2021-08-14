import java.math.BigDecimal;

class Main {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();

	p.setNome("Francisco Julio");
	p.setDataNascimento("1998-07-26");
	p.setAltura(new BigDecimal("1.75"));

	p.calculaIdade();

	System.out.println(p.toString());
  }
}