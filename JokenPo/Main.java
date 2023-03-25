package javaapplication1;


import java.util.Random;
import java.util.Scanner;
import javaapplication1.domain.Algoritmo;
import javaapplication1.domain.Jokenpo;
import javaapplication1.domain.Lagarto;
import javaapplication1.domain.Papel;
import javaapplication1.domain.Pedra;
import javaapplication1.domain.Spock;
import javaapplication1.domain.Tesoura;
import javaapplication1.domain.Tipo;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        //TODO: Implementar regra para criação do tipo om base na classe Algoritmo
        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            case 2 -> algoritmo = new Tesoura(); //TODO: Implementar a classe Tesoura
            case 3 -> algoritmo = new Pedra(); //TODO: Implementar a classe Pedra
            case 4 -> algoritmo = new Lagarto(); //TODO: Implementar a classe Lagarto
            case 5 -> algoritmo = new Spock(); //TODO: Implementar a classe Spock
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return algoritmo;
    }
}

   
