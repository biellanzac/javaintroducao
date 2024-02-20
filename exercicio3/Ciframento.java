package exercicio3;

public class Ciframento {
    
    public static void main(String[] args){
        String teste = "abc";
        String cifrada = ciframento(teste);
        System.out.println("Frase cifrada: " + cifrada);
    }

    public static String ciframento(String teste){
        StringBuilder cifrada = new StringBuilder();

        for (int i = 0; i < teste.length(); i++) {
            char caractere = teste.charAt(i);
            int valorAscii = (int) caractere;
            valorAscii += 3; // Incrementa o valor ASCII em 3 para cifrar
            char novoCaractere = (char) valorAscii;
            cifrada.append(novoCaractere);
        }

        return cifrada.toString();
    }
}
