class Contador {
	private int valor;

	public Contador() {
		valor = 0;
	}

	public Contador(int valorInicial) {
		valor = valorInicial;
	}

	public void incrementar(int a){
		this.valor = valor + a;
	}

	public void incrementar(){
		this.valor++;
	}

	public void decrementar(){
		this.valor--;
	}

	public void zerar(){
		this.valor = 0;
	}

	public int getValor(){
		return this.valor;
	}

	public int setValor(int valor){
		return this.valor = valor;
	}

	public void imprimir(){
		System.out.println("Contador esta em: " + this.valor);
	}
}