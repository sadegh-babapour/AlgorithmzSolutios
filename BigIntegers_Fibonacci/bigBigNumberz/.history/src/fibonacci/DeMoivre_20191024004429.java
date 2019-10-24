package fibonacci;
/***
 * @author Sadegh Babapour
 * 
 * I have implemented the French Mathematician Monsieur De Moivre's
 * formula for calculating fibonacci numbers.
 * The F(n) = F(n-1) + F(n-2), is inefficient because of the 2 recursion
 * calls. He used the Golden ratio 0.5 * [1 + sqrt(5)]
 * 
 ***/
 
/***
 * 
 * @param GOLDENRATIO    0.5 * [1+sqrt(5)]  
 * @param CONJUGATE      0.5 * [1-sqrt(5)] 
 * 
***/

public class DeMoivre
{
    private final double GOLDENRATIO = 0.5 * (1 + Math.sqrt(5));
    private final double CONJUGATE = 0.5 * (1 - Math.sqrt(5));
    private final LargeInteger goal;

    public LargeInteger DeMoivre(int input)
    {
        this.goal = calculate(input); 
    }

    public LargeInteger calculate(int n)
    {

        return (Math.pow(GOLDENRATIO, n) - Math.pow(CONJUGATE, n) / Math.sqrt(5)

    }

}