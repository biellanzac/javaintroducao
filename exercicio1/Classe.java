package exercicio1;

public class Classe {

    public static void main(String[] args) {
        String s = "Leonam";
        if (palindromo(s)) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }

    public static boolean palindromo(String s) {
        int direita = 0;
        int esquerda = s.length() - 1;

        while (direita < esquerda) {
            if (s.charAt(direita) != s.charAt(esquerda)) {
                return false;
            }
            direita++;
            esquerda--;
        }
        return true;
    }
}
