class Main {
  public static void main(String[] args) {
    Contador c = new Contador(10);

	c.incrementar();
	c.incrementar();
	c.incrementar(10);

	c.decrementar();

	c.imprimir();

	c.zerar();
	c.imprimir();
  }
}