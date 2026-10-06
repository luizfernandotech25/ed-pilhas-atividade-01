package br.edu.ifgoiano.pilhas;

public class EdPilhasAtividade01 {

    /**
     * Inverte os caracteres de uma palavra utilizando uma estrutura de Pilha.
     *
     * @param palavra palavra que será invertida
     * @return palavra com os caracteres em ordem inversa
     */
    public static String inverterPalavra(String palavra) {

        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInvertida = "";

        while (!pilha.isEmpty()) {
            palavraInvertida += pilha.pop();
        }

        return palavraInvertida;
    }

    public static void main(String[] args) {

        String frase = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";

        String[] palavras = frase.split(" ");

        String resultado = "";

        for (String palavra : palavras) {
            String palavraInvertida = inverterPalavra(palavra);
            resultado += palavraInvertida + " ";
        }

        System.out.println(resultado.trim());
    }
}
