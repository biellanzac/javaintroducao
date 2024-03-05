package exercicio4;

import java.util.Random;

public class Alteracao {

    public static void main(String[] args) {
        
    }

    public static char[] Gerador() {
        Random gerador = new Random();
        gerador.setSeed(4);
        
        char[] letrasGeradas = new char[2];
        for (int i = 0; i < 2; i++) {
            letrasGeradas[i] = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
        }
        
        return letrasGeradas;
    }

    public static char Alterar(char letrasGeradas; String s){
        for(int i = 0; i < s.length(s); i++){
            if(s.charAt(i) == letrasGeradas)
        }
    }
}
