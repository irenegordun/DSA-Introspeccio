package edu.upc.eetac.dsa;

import java.lang.reflect.*;

public class main {
    public static void main(String[] args){
        Coche coche = new Coche();
        Method[] metodos = coche.getClass().getDeclaredMethods();

        System.out.println("Coche"+ coche.getMarca());

        for (Method m: metodos)
            System.out.println("\t"+ m.toString());
    }
}
