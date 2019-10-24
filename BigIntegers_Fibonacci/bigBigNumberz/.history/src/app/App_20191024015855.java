package app;

import bigInteger.LargeInteger;
import fibonacci.DeMoivre;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Galaxies!");
        
        DeMoivre fastFibbo = new DeMoivre(45);
        System.out.println(fastFibbo.calculate());

        int n = 777;
        String one = "45468921365098564552312343657788797943423425475678";
        
        LargeInteger one = new LargeInteger("98986874766565656454543");


        System.out.println(fibbo);
        
    }
}