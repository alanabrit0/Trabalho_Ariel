public class FilaArray {
    private int[] dados;
    private int inicio, fim, tamanho;

    public FilaArray(int capacidade) {
        dados = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("Erro: Fila cheia!");
        } else {
            fim = (fim + 1) % dados.length;
            dados[fim] = valor;
            tamanho++;
            System.out.println("Inserido: " + valor);
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            System.out.println("Removido: " + dados[inicio]);
            inicio = (inicio + 1) % dados.length;
            tamanho--;
        }
    }

    public void front() {
        if (isEmpty()) {
            System.out.println("Erro: Fila vazia!");
        } else {
            System.out.println("Primeiro: " + dados[inicio]);
        }
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == dados.length;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.print("Elementos da fila: ");
            for (int i = 0; i < tamanho; i++) {
                int index = (inicio + i) % dados.length;
                System.out.print(dados[index] + " ");
            }
            System.out.println();
        }
    }

    public void clear() {
        inicio = 0;
        fim = -1;
        tamanho = 0;
        System.out.println("Fila limpa!");
    }

    public int size() {
        return tamanho;
    }
}