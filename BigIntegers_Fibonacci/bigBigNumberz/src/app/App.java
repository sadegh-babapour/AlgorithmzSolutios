package app;

import biginteger.LargeInteger;
import fibonacci.DeMoivre;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Galaxies!");
        
        DeMoivre fastFibbo = new DeMoivre(45);
        System.out.println(fastFibbo.calculate());

        int n = 777;
        String one = "1234567890987654321";
        String two = "1357908642";
        biginteger.LargeInteger yek = new LargeInteger(one);
        LargeInteger doo = new LargeInteger(two);


        System.out.println(yek);
        System.out.println("==============================================");
        System.out.println(yek.add(doo));

        // TO DO:
        // implement multiplication to calculate huge fibonaccizzzzz
        
    }
}