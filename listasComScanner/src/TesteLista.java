import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade da lista: ");
        int capacidade = scanner.nextInt();
        ListaArray lista = new ListaArray(capacidade);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar elemento");
            System.out.println("2 - Adicionar elemento em posição específica");
            System.out.println("3 - Remover elemento");
            System.out.println("4 - Imprimir lista");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a adicionar: ");
                    int elemento = scanner.nextInt();
                    lista.adicionar(elemento);
                    break;
                case 2:
                    System.out.print("Digite o elemento a adicionar: ");
                    int elem = scanner.nextInt();
                    System.out.print("Digite a posição: ");
                    int pos = scanner.nextInt();
                    lista.adicionar(elem, pos);
                    break;
                case 3:
                    System.out.print("Digite a posição a remover: ");
                    int posRemover = scanner.nextInt();
                    lista.remover(posRemover);
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