/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo2;

/**
 *
 * @author ice
 */
public class Tabuleiro {
    public final int pont [] = new int [10];

    public Tabuleiro() {
        for (int i =0;i<pont.length;i++)
            this.pont[i] = 0;
    }

     
    
    public void exibePlacar(){
        for(int i=0; i<pont.length;i++){
            System.out.println(pont[i]);
        }
    }
    
    public int calcPontos(Dado [] dados){
        int pontos = 0;
        for (Dado dado : dados) {
            pontos+=dado.face;
        }
        return pontos;
    }
    
}

