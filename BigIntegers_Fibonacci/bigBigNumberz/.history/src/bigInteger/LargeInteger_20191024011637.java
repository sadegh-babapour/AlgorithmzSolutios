package biginteger;

public class LargeInteger
{
    private int [] integers;

    public LargeInteger(String inputNumber)
    {
        int capacity = inputNumber.length();
        this.integers = new int [capacity];

        for (int i = 0; i < capacity; i++)
        {
            try
            {
                integers[i] = Integer.parseInt(inputNumber.charAt(i) +"");
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

    public LargeInteger add(LargeInteger secondNumber)
    {
        int sizeOfSecond = secondNumber.integers.length;
        if (sizeOfSecond >= this.integers.length)
        {
            int [] result = new int [size]
        }
    }
}