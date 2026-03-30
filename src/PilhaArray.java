public class PilhaArray {
    private int[] dados;
    private int topo;

    public PilhaArray(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("Erro: Pilha cheia!");
        } else {
            dados[++topo] = valor;
            System.out.println("Empilhado: " + valor);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
        } else {
            System.out.println("Desempilhado: " + dados[topo--]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
        } else {
            System.out.println("Topo: " + dados[topo]);
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == dados.length - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.print("Elementos da pilha: ");
            for (int i = topo; i >= 0; i--) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }

    public void clear() {
        topo = -1;
        System.out.println("Pilha limpa!");
    }

    public int size() {
        return topo + 1;
    }
}