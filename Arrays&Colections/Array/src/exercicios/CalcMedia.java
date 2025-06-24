package exercicios;

import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // pegondo o scanner para ler os dados do usuário
        System.out.print("Quantas notas deseja informar? ");
        int quantidadeNotas = entrada.nextInt(); // solicitando a quantidade de notas

        double[] notas = new double[quantidadeNotas]; // criando um array de notas com o tamanho informado pelo usuário
        double total = 0; // variável para armazenar a soma das notas
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble(); // solicitando cada nota ao usuário
        }
        for (double nota : notas) { // percorrendo o array de notas para calcular a soma
            total += nota; // somando cada nota ao total
        }   
        double media = total / quantidadeNotas; // calculando a média das notas
        System.out.println("Notas do aluno: " + java.util.Arrays.toString(notas)); // exibindo as notas informadas pelo usuário
        System.out.printf("Média do aluno: %.2f%n", media); // exibindo a média formatada com duas casas decimais
        entrada.close();

    }
}
