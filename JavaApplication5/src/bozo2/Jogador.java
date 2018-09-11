/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogador {
    private Tabuleiro tab;
    private String nome;
    private static final int maxTentativas = 3;
    private  Dado [] dados;
    int tentativas;

    public Jogador() {
        this.tentativas = 0;
        this.dados = new Dado [5];
        for(int i =0; i<dados.length;i++){
            dados[i] = new Dado();
            dados[i].rolar();
            
        }
    }
    
    public void lancaDados(){
        for ( Dado d : dados)
            d.rolar();
            
    }
    
    void rolaAlguns(String c, Dado [] dados){
        
        String [] partes = c.split(",");
        for (int i =0; i<partes.length; i++) {
            dados[Integer.parseInt(partes[i])].rolar();
        }
        this.tentativas++;
                
        
    }
    
    void exibeFaces(){
        String face;
        for (Dado d : dados){
            face = d.exibeFace();
            System.out.println(face);}
    }
    
    private void escolhePos(){
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        
        
    }
            
    public Tabuleiro getTab() {
        return tab;
    }

    public void setTab(Tabuleiro tab) {
        this.tab = tab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
