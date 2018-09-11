/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo2;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Bozo {

    public List<Jogador> jogs;
    public final Dado dados[] = new Dado[5];

    public void inicia() {
        Scanner s = new Scanner(System.in);
        int n;
        String c;
        System.out.println("Numero de jogadores: ");
        n = s.nextInt();

        jogs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            jogs.add(new Jogador());
            c = s.next();
            Jogador j = jogs.get(i);
            j.setNome(c);

        }

    }

    public void joga() {
        Scanner s = new Scanner(in);
        jogs.forEach((j)
                -> {
            j.lancaDados();
            j.exibeFaces();
            System.out.println("Deseja rolar novamente?[sim/nao]");
            String c = s.next();
            while (j.tentativas < 3) {
                if ("sim".equals(c)) {
                    System.out.println("Digite os dados que devem ser rolados");
                    c = s.next();
                    j.rolaAlguns(c, dados);

                } else 
                    break;
                

            }
        });

    }

}
