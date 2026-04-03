
package projeto_ufc;

import java.util.Random;
 
public class Main_UFC {
    public static void main(String[] args) {
        Random rand = new Random();

        Lutador[] player = new Lutador[6];
        player[0] = new Lutador("Johnny Cage","Estados Unidos",35,1.85,80,null,0,0,0);
        player[1] = new Lutador("Kung Lao","China",27,1.69,68,null,0,0,0);
        player[2] = new Lutador("Scorpion","Japão",182,1.72,70,null,0,0,0);
        player[3] =  new Lutador("Goro","Exoterra",2000,2.51,110,null,0,0,0);
        player[4] =  new Lutador("Jax Briggs","Estados Unidos",40,1.90,100,null,0,0,0);
        player[5] =  new Lutador("Kano","Austrália",38,1.80,83,null,0,0,0);
       
        player[0].apresentar();
        player[0].status();
        player[1].apresentar();
        player[1].status();
        player[2].apresentar();
        player[2].status();
        player[3].apresentar();
        player[3].status();
        player[4].apresentar();
        player[4].status();
        player[5].apresentar();
        player[5].status();

        Luta base1 = new Luta();

        int randA;
        int randB;

        //Loop caotico que me levou horas pra conseguir...
        do {
            do {
                randA = rand.nextInt(6);
                randB = rand.nextInt(6);
            } while (randA == randB);

            base1.marcarLuta(player[randA], player[randB]);

        } while (!base1.novoAprovado());

        base1.round(1);
        base1.Lutar(player[randA],player[randB]);
        base1.round(2);
        base1.Lutar(player[randA],player[randB]);
        base1.round(3);
        base1.Lutar(player[randA],player[randB]);

        player[randA].status();
        player[randB].status();
        
        base1.placarFinal(player[randA],player[randB]);

        System.exit(0);
    }
}
