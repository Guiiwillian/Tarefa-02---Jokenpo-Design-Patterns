/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.domain;

import java.util.Map;

/**
 *
 * @author f290ti
 */
public class Jokenpo {
    
    private Algoritmo algoritmo;

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    public void jogar(Tipo pTipo){
        Map<String, String> map = algoritmo.executar(pTipo);
        System.out.println(map);
    }
}
