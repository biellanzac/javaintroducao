package exercicio8;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Arquivo {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de valores a serem lidos: ");
        int n = scanner.nextInt();

        try {
            // Abre o arquivo para escrita
            File arquivo = new File("valores.txt");
            RandomAccessFile raf = new RandomAccessFile(arquivo, "rw");

            // Lê 'n' números reais e grava no arquivo
            for (int i = 0; i < n; i++) {
                double valor = scanner.nextDouble();
                raf.writeDouble(valor);
            }

            // Fecha o arquivo após a escrita
            raf.close();

            // Reabre o arquivo para leitura
            raf = new RandomAccessFile(arquivo, "r");

            // Move o ponteiro de arquivo para o final do arquivo
            raf.seek(raf.length());

            // Lê os valores do arquivo de trás para frente e exibe na tela
            while (raf.getFilePointer() > 0) {
                raf.seek(raf.getFilePointer() - 8); // Cada valor real tem 8 bytes
                System.out.println(raf.readDouble());
            }

            // Fecha o arquivo após a leitura
            raf.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao trabalhar com o arquivo.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    }



