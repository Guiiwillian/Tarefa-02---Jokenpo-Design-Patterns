
package javaapplication1.domain;

import java.util.Map;
import static javaapplication1.domain.Tipo.LAGARTO;
import static javaapplication1.domain.Tipo.PAPEL;
import static javaapplication1.domain.Tipo.PEDRA;
import static javaapplication1.domain.Tipo.SPOCK;
import static javaapplication1.domain.Tipo.TESOURA;


public class Lagarto extends Algoritmo {

    @Override
    public Map<String, String> executar(Tipo pTipo) {
          switch (pTipo){
       
           case PAPEL -> valor = "Ganhou. Lagarto come papel!";
           case TESOURA -> valor = "Perdeu! Tesoura decapta o lagarto!";
           case PEDRA -> valor = "Perdeu! Pedra esmaga lagarto!";
           case LAGARTO -> valor = "Empatou! Lagarto empata com lagarto!";
           case SPOCK -> valor = "Ganhou! Lagarto envenena o Spock!";  
           default -> valor = "Opção inválida!";
               
       } 
        return null;
    }
 

    
}
/*
else if (jogada == LAGARTO && computador == PAPEL) {
            System.out.println("Ganhou. Lagarto come papel!");
        } else if (jogada == LAGARTO && computador == TESOURA) {
            System.out.println("Perdeu! Tesoura decapta o lagarto!");
        } else if (jogada == LAGARTO && computador == PEDRA) {
            System.out.println("Perdeu! Pedra esmaga lagarto!");
        } else if (jogada == LAGARTO && computador == LAGARTO) {
            System.out.println("Empatou! Lagarto empata com lagarto!");
        } else if (jogada == LAGARTO) {
            System.out.println("Ganhou! Lagarto envenena o Spock!");

*/