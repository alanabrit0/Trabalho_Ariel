import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Permitir ao usuário definir o tamanho
        System.out.print("Digite o tamanho da pilha: ");
        int tamanhoPilha = sc.nextInt();
        System.out.print("Digite o tamanho da fila: ");
        int tamanhoFila = sc.nextInt();

        PilhaArray pilha = new PilhaArray(tamanhoPilha);
        FilaArray fila = new FilaArray(tamanhoFila);

        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Pilha");
            System.out.println("2 - Fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = validarEntrada(sc);

            switch (opcao) {
                case 1:
                    menuPilha(sc, pilha);
                    break;
                case 2:
                    menuFila(sc, fila);
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }

    private static void menuPilha(Scanner sc, PilhaArray pilha) {
        int op;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar ");
            System.out.println("2 - Desempilhar ");
            System.out.println("3 - Topo ");
            System.out.println("4 - Está vazia?");
            System.out.println("5 - Está cheia?");
            System.out.println("6 - Exibir elementos");
            System.out.println("7 - Limpar pilha");
            System.out.println("8 - Quantidade de elementos");
            System.out.println("9 - Voltar");
            System.out.print("Escolha: ");
            op = validarEntrada(sc);

            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    int valor = validarEntrada(sc);
                    pilha.push(valor);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.peek();
                    break;
                case 4:
                    System.out.println("Vazia? " + pilha.isEmpty());
                    break;
                case 5:
                    System.out.println("Cheia? " + pilha.isFull());
                    break;
                case 6:
                    pilha.display();
                    break;
                case 7:
                    pilha.clear();
                    break;
                case 8:
                    System.out.println("Quantidade: " + pilha.size());
                    break;
            }
        } while (op != 9);
    }

    private static void menuFila(Scanner sc, FilaArray fila) {
        int op;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Inserir ");
            System.out.println("2 - Remover ");
            System.out.println("3 - Primeiro ");
            System.out.println("4 - Está vazia?");
            System.out.println("5 - Está cheia?");
            System.out.println("6 - Exibir elementos");
            System.out.println("7 - Limpar fila");
            System.out.println("8 - Quantidade de elementos");
            System.out.println("9 - Voltar");
            System.out.print("Escolha: ");
            op = validarEntrada(sc);

            switch (op) {
                case 1:
                    System.out.print("Digite o valor: ");
                    int valor = validarEntrada(sc);
                    fila.enqueue(valor);
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.front();
                    break;
                case 4:
                    System.out.println("Vazia? " + fila.isEmpty());
                    break;
                case 5:
                    System.out.println("Cheia? " + fila.isFull());
                    break;
                case 6:
                    fila.display();
                    break;
                case 7:
                    fila.clear();
                    break;
                case 8:
                    System.out.println("Quantidade: " + fila.size());
                    break;
            }
        } while (op != 9);
    }

    // Validação de entrada para evitar erro com letras
    private static int validarEntrada(Scanner sc) {
        int valor = -1;
        boolean valido = false;
        while (!valido) {
            try {
                valor = sc.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.next(); // descarta entrada inválida
            }
        }
        return valor;
    }
}