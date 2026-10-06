package br.edu.ifgoiano.pilhas;

/**
 * Implementa uma estrutura de dados do tipo Pilha (LIFO).
 *
 * @author Luiz Fernando
 */
public class Pilha {

    private char[] elementos;
    private int topo;

    /**
     * Cria uma pilha com a capacidade informada.
     *
     * @param capacidade quantidade máxima de elementos da pilha
     */
    public Pilha(int capacidade) {
        elementos = new char[capacidade];
        topo = -1;
    }

    /**
     * Insere um caractere no topo da pilha.
     *
     * @param elemento caractere a ser empilhado
     * @throws IllegalStateException se a pilha estiver cheia
     */
    public void push(char elemento) {
        if (topo == elementos.length - 1) {
            throw new IllegalStateException("Pilha cheia.");
        }

        topo++;
        elementos[topo] = elemento;
    }

    /**
     * Remove e retorna o caractere que está no topo da pilha.
     *
     * @return caractere removido
     * @throws IllegalStateException se a pilha estiver vazia
     */
    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia.");
        }

        char elemento = elementos[topo];
        topo--;

        return elemento;
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia; false caso contrário
     */
    public boolean isEmpty() {
        return topo == -1;
    }
}