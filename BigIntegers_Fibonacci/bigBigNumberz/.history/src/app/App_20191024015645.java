package app;

import bigInteger.LargeInteger;
import fibonacci.DeMoivre;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Galaxies!");
        
        DeMoivre fastFibbo = new DeMoivre(45);
        System.out.println(fastFibbo.calculate());


        System.out.println(fibbo);
        
    }
}