package exercicios;

import java.util.Arrays;

public class arrays {
public static void main(String[] args) {
    double[] notas = new double[4];
    notas[3] = 7.5;
    notas[0] = 8.5;
    notas[1] = 9.0;
    notas[2] = 6.0;
    System.out.println("Notas do aluno: " + Arrays.toString(notas));

    double total = 0;
    for (int i = 0; i < notas.length; i++) {
        total += notas[i];
    }
    System.out.println("Média do aluno: " + (total / notas.length));
}
}
