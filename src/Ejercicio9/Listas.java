package Ejercicio9;

import java.util.Arrays;

public class Listas {

    private int[] lista1;
    private int[] lista2;
    private int[] listaF;

    public int[] getLista1() {
        return lista1;
    }

    public void setLista1(int[] lista1) {
        this.lista1 = lista1;
    }

    public int[] getLista2() {
        return lista2;
    }

    public void setLista2(int[] lista2) {
        this.lista2 = lista2;
    }

    public int[] getListaF() {
        return listaF;
    }

    public void setListaF(int[] listaF) {
        this.listaF = listaF;
    }

    public Listas(int[] lista1, int[] lista2) {
        this.lista1 = lista1;
        this.lista2 = lista2;
    }

    //metodo unionDeListas
    /* definir el tamaño del arreglo final:
    *   con un for
    *       primero llenar el arreglo final con los elementos del primer arreglo
    *       segundo llenar los espacios vacios restantes del arreglo final con los elementos del segundo arreglo
    *   retornar el arreglo final*/

    public int[] unionDeListas(){
        listaF = new int[lista1.length+lista2.length];

            for (int i = 0; i < lista1.length; i++) {
                listaF[i] = lista1[i];
            }

            for (int i = lista1.length; i < listaF.length; i++) {
                listaF[i]=lista2[i - lista1.length];
            }

        return listaF;
    }

    //metodo ordenamientoDeLista
    /* llamar a la libreria Arrays
    *   utilizar el metodo sort*/

    public int[] ordenamientoDeLista(){
        Arrays.sort(listaF);

        return listaF;
    }

    @Override
    public String toString() {
        return "listaF={" + Arrays.toString(listaF) +
                '}';
    }
}
