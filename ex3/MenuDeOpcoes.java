import java.util.Scanner;

public class MenuDeOpcoes {
	public void menu() throws ListaCheiaException {
		Scanner scan = new Scanner(System.in);

		Agenda agenda = new Agenda();

		System.out.println("***********************************************************");
		System.out.println("******************** AGENDA TELEFÔNICA ********************");
		System.out.println("***********************************************************\n");
		int opcao;
		do {
			System.out.println("***********************************************************");
			System.out.println("Informe a alternativa desejada referente ao menu abaixo:\n");
			System.out.println("1 - Listar os contatos\n");
			System.out.println("2 - Inserir novo contato\n");
			System.out.println("3 - Pesquisa contato\n");
			System.out.println("4 - Editar contato\n");
			System.out.println("5 - Apagar contato\n");
			System.out.println("6 - Apagar todos os contatos existentes\n");
			System.out.println("7 - Mostrar memória\n");
			System.out.println("0 - Sair\n");
			System.out.println("***********************************************************");
			opcao = scan.nextInt();

			System.out.println(opcao);
			switch (opcao) {
				case 0:
					System.out.println("\n\nSAIU!!");
					break;
				case 1:
					agenda.listarTodos();
					break;
				case 2:
					agenda.inserirContato();
					break;
				case 3:
					agenda.pesquisaContato();
					break;
				case 4:
					agenda.editarContato();
					break;
				case 5:
					agenda.apagarContato();
					break;
				case 6:
					agenda.apagarTodos();
					break;
				case 7:
					agenda.imprimirMemoria();
					break;
				default:
					System.out.println("Opção inválida!!!\n\n");
			}
		} while (opcao != 0);

		scan.close();
	}
}