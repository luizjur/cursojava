package exercicios;

import java.util.Scanner;

public class AppRobo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        char posicao;
        char movimento;


        System.out.println("digite h horizontal e v vertical: "); 
        posicao = entrada.nextLine().charAt(0);
        //posição informa h, vai andar x, e v vai andar y 

        System.out.println("digite + ou - : ");
        movimento = entrada.nextLine().charAt(0);
        // se informou h + direita e - esquerda. se informou v + sobe e - desce

        Robo robo = new Robo(); //1 Robo classe "new robo" criando robo, construtor, tem que ser igua classe

        robo.andar(posicao, movimento);
        System.out.println("posição de X: " + robo.getX() + "posição Y:" + robo.getY()); 
/*
        robo.andaesquer(andaesquerda);
        System.out.println("posição de X: " + x "posição Y:" + y); 

        robo.andacima(andacima);
        System.out.println("posição de X: " + x "posição Y:" + y); 

        robo.andabixo(andabaixo);
        System.out.println("posição de X: " + x "posição Y:" + y); 
*/
        entrada.close();
    }
}