import java.util.Scanner;

public class TesteListaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade da lista: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        ListaArrayString lista = new ListaArrayString(capacidade);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome por posição");
            System.out.println("3 - Buscar nome");
            System.out.println("4 - Imprimir lista");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a adicionar: ");
                    String nome = scanner.nextLine();
                    lista.adicionar(nome);
                    break;
                case 2:
                    System.out.print("Digite a posição a remover: ");
                    int posicao = scanner.nextInt();
                    lista.remover(posicao);
                    break;
                case 3:
                    System.out.print("Digite o nome a buscar: ");
                    String busca = scanner.nextLine();
                    if (lista.buscar(busca)) {
                        System.out.println("Nome encontrado na lista.");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}