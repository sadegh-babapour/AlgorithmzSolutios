package app;

import biginteger.LargeInteger;
import fibonacci.DeMoivre;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Galaxies!");
        
        DeMoivre fastFibbo = new DeMoivre(45);
        System.out.println(fastFibbo.calculate());

        int n = 777;
        String one = "45468921365098564552312343657788797943423425475678";
        String two = "3435665776898756544354353243243565765567668678798876554644";
        biginteger.LargeInteger yek = new LargeInteger(one);
        LargeInteger doo = new LargeInteger(two);



        System.out.println(yek.add(doo));
        
    }
}