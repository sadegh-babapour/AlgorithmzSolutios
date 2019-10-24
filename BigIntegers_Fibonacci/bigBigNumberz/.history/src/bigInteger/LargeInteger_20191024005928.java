package biginteger;

public class LargeInteger
{
    private int [] integers;

    public LargeInteger(String inputNumber)
    {
        int capacity = inputNumber.length();
        this.integers = new int [capacity];

        for (int i = capacity-1; i >=0; i++)
        {
            try
            {
                integers[i] = Integer.parseInt(i);
            }catch(NumberFormatException e)
            {
                System.err.println("Cannot be parsed!!");
            }
        }
    }

    @Override
    public String toString()
    {
        String theNumber = "";
        for(int i : this.integers)
        {
            theNumber.concat(i + "");
        }
        return theNumber;
    }
}