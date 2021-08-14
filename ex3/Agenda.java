import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	ArrayList<Contato> registros = new ArrayList<Contato>();
	int tamanhoMaximo = 10;
	Scanner scan = new Scanner(System.in);

	public void listarTodos() {
		if (this.registros.size() == 0) {
			System.out.println("==============================================");
			System.out.println("A lista está vazia!");
			System.out.println("==============================================\n");
		} else {
			for (int i = 0; i < registros.size(); i++) {
				System.out.println("==============================================");
				System.out.println("Código: " + registros.get(i).getCodigo());
				System.out.println("Nome: " + registros.get(i).getNome());
				System.out.println("Telefone: " + registros.get(i).getTelefone());
				System.out.println("==============================================\n");
			}
		}
	}

	public void inserirContato() throws ListaCheiaException {
		int tamanhoLista = this.registros.size();
		if (tamanhoLista < this.tamanhoMaximo) {
			Contato c = new Contato();

			System.out.println("==============================================");
			System.out.println("Informe o codigo:\n");
			c.setCodigo(scan.nextInt());
			System.out.println("Informe o nome:\n");
			c.setNome(scan.next());
			System.out.println("Informe o telefone:\n");
			c.setTelefone(scan.next());
			System.out.println("==============================================\n");

			this.registros.add(c);
		} else {
			throw new ListaCheiaException();
		}
	}

	public void editarContato() {
		System.out.println("==============================================");
		System.out.println("Informe o codigo do contato:\n");
		int codigo = scan.nextInt();
		System.out.println("==============================================\n");

		for (int i = 0; i < this.registros.size(); i++) {
			if (this.registros.get(i).getCodigo() == codigo) {
				System.out.println("==============================================");
				System.out.println("Informe o novo nome:\n");
				String nome = scan.next();
				System.out.println("Informe o novo telefone:\n");
				String telefone = scan.next();
				System.out.println("==============================================\n");

				this.registros.get(i).setNome(nome);
				this.registros.get(i).setTelefone(telefone);
				return;
			}
		}

		System.out.println("==============================================");
		System.out.println("Registro Não Encontrado.");
		System.out.println("==============================================\n");
	}

	public void apagarContato() {
		System.out.println("==============================================");
		System.out.println("Informe o codigo do contato:\n");
		int codigo = scan.nextInt();
		System.out.println("==============================================");

		for (int i = 0; i < this.registros.size(); i++) {
			if (this.registros.get(i).getCodigo() == codigo) {
				this.registros.remove(i);
				return;
			}
		}

		System.out.println("==============================================");
		System.out.println("Registro Não Encontrado.");
		System.out.println("==============================================\n");
	}

	public void apagarTodos() {
		this.registros.clear();
	}

	public void pesquisaContato() {
		System.out.println("==============================================");
		System.out.println("Informe o codigo do contato:\n");
		int indicador = scan.nextInt();
		System.out.println("==============================================");
		for (int i = 0; i < this.registros.size(); i++) {
			if (this.registros.get(i).getCodigo() == indicador) {
				System.out.println("==============================================");
				System.out.println("Código: " + registros.get(i).getCodigo());
				System.out.println("Nome: " + registros.get(i).getNome());
				System.out.println("Telefone: " + registros.get(i).getTelefone());
				System.out.println("==============================================\n");
				return;
			}
		}

		System.out.println("==============================================");
		System.out.println("Registro Não Encontrado.");
		System.out.println("==============================================\n");
	}

	public void imprimirMemoria() {
		int memoria = this.registros.size();
		System.out.println("Memória: " + memoria + "/10");
	}
}