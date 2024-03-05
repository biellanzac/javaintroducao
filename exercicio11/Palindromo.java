package exercicio11;

public class Palindromo {
    public static void main(String[] args) {
        String s = "teste";

        Palindromo_recursivo(s, 0, s.length() - 1);
    }

    public static boolean Palindromo_recursivo(String s, int inicio, int fim){
        if(inicio >= fim){
            return true;
        }
        if(s.charAt(inicio) != s.charAt(fim)){
            return false;
        }

        return Palindromo_recursivo(s, inicio + 1, fim - 1);

    }
}
