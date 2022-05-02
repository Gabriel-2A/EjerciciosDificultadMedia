package Ejercicio9;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Random random = new Random();

        int longitudlis1 = random.nextInt(10), longitudlis2 = random.nextInt(10);

        Listas li = new Listas(new int[longitudlis1], new int[longitudlis2]);


        int[] listaA = new int[li.getLista1().length];
        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = random.nextInt(100);
        }
        li.setLista1(listaA);


        int[] listaB = new int[li.getLista2().length];
        for (int i = 0; i < listaB.length; i++) {
            listaB[i] = random.nextInt(100);
        }
        li.setLista2(listaB);


        System.out.println(Arrays.toString(li.getLista1()));
        System.out.println(Arrays.toString(li.getLista2()));

        li.unionDeListas();
        li.toString();
    }

}
