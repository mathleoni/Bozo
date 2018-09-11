/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo2;
import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado {
    private int numFaces = 6;
    int face;
    
    public Dado(){
        this.face = 0;
    }
    
    public void rolar() {
        Random rand = new Random();
        this.face = rand.nextInt(5) + 1;

    }
    
    public String exibeFace(){
        String exibe = null;
        switch(face){
            case 1:
                exibe = ".";
                break;
            case 2:
                exibe = "..";
                break;
            case 3:
                exibe = ":.";
                break;
            case 4:
                exibe = "::";
                break;
            case 5:
                exibe = "::.";
                break;
            case 6:
                exibe = ":::";
                break;
        }
        return exibe;
        
    }
    
    
}
