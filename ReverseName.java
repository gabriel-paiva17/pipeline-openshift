/**
 * ================================================================
 * PROGRAMA: ReverseName - DEMONSTRACAO DE INVERSAO DE NOMES
 * AUTOR: BOB
 * DATA: 2026-03-27
 * DESCRICAO: PROGRAMA QUE DEMONSTRA 4 METODOS DIFERENTES
 *            PARA INVERTER UM NOME EM JAVA
 * ================================================================
 */

public class ReverseName {
    
    // Variáveis da classe
    private static final String NAME = "ISABELLE";
    private static final int LIMIT = 5;
    
    public static void main(String[] args) {
        System.out.println("=== INICIO DO PROGRAMA ===");
        System.out.println("OLA, " + NAME);
        System.out.println();
        
        System.out.println("=== METODOS DE INVERSAO DE NOME ===");
        System.out.println("NOME ORIGINAL: " + NAME);
        System.out.println("TAMANHO: " + NAME.length() + " CARACTERES");
        System.out.println();
        
        // Executar os 4 métodos de inversão
        metodo1LoopSimples();
        metodo2StringBuilder();
        metodo3Recursivo();
        metodo4AlgoritmoSwap();
        
        System.out.println();
        System.out.println("=== LOOP CONTADOR ORIGINAL ===");
        loopContador();
        
        System.out.println();
        System.out.println("=== FIM DO PROGRAMA ===");
    }
    
    /**
     * ================================================================
     * METODO 1: LOOP SIMPLES (CARACTERE POR CARACTERE)
     * DESCRICAO: PERCORRE O NOME DA DIREITA PARA ESQUERDA
     *            E CONCATENA CADA CARACTERE
     * ================================================================
     */
    private static void metodo1LoopSimples() {
        System.out.println("--- METODO 1: LOOP SIMPLES ---");
        
        String reversed = "";
        
        // Percorrer de trás para frente
        for (int i = NAME.length() - 1; i >= 0; i--) {
            reversed += NAME.charAt(i);
        }
        
        System.out.println("NOME INVERTIDO: " + reversed);
        System.out.println();
    }
    
    /**
     * ================================================================
     * METODO 2: USANDO STRINGBUILDER
     * DESCRICAO: USA A CLASSE STRINGBUILDER COM METODO REVERSE
     *            METODO MAIS EFICIENTE E MODERNO
     * ================================================================
     */
    private static void metodo2StringBuilder() {
        System.out.println("--- METODO 2: STRINGBUILDER ---");
        
        StringBuilder sb = new StringBuilder(NAME);
        String reversed = sb.reverse().toString();
        
        System.out.println("NOME INVERTIDO: " + reversed);
        System.out.println();
    }
    
    /**
     * ================================================================
     * METODO 3: RECURSIVO
     * DESCRICAO: USA RECURSAO PARA INVERTER A STRING
     *            DEMONSTRA PROGRAMACAO FUNCIONAL
     * ================================================================
     */
    private static void metodo3Recursivo() {
        System.out.println("--- METODO 3: RECURSIVO ---");
        
        String reversed = reverseRecursive(NAME);
        
        System.out.println("NOME INVERTIDO: " + reversed);
        System.out.println();
    }
    
    /**
     * Método auxiliar recursivo para inversão
     */
    private static String reverseRecursive(String str) {
        // Caso base: string vazia ou com 1 caractere
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursão: último caractere + inversão do resto
        return str.charAt(str.length() - 1) + 
               reverseRecursive(str.substring(0, str.length() - 1));
    }
    
    /**
     * ================================================================
     * METODO 4: ALGORITMO SWAP (TROCA DE EXTREMIDADES)
     * DESCRICAO: TROCA CARACTERES DAS EXTREMIDADES
     *            MOVENDO-SE PARA O CENTRO
     * ================================================================
     */
    private static void metodo4AlgoritmoSwap() {
        System.out.println("--- METODO 4: ALGORITMO SWAP ---");
        
        // Converter string para array de caracteres
        char[] chars = NAME.toCharArray();
        
        int start = 0;
        int end = chars.length - 1;
        
        // Trocar caracteres das extremidades
        while (start < end) {
            // Swap
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
        
        String reversed = new String(chars);
        
        System.out.println("NOME INVERTIDO: " + reversed);
        System.out.println();
    }
    
    /**
     * ================================================================
     * LOOP CONTADOR ORIGINAL
     * ================================================================
     */
    private static void loopContador() {
        for (int counter = 1; counter <= LIMIT; counter++) {
            System.out.println("CONTADOR: " + String.format("%02d", counter));
        }
    }
}

// Made with Bob
