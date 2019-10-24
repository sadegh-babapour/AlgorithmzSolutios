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
        int sizeOfCurrent = this.integers.length;
        int length;

        if (sizeOfSecond >= sizeOfCurrent)
        {
            length = sizeOfSecond + 1;
        }
        else
        {
            length = sizeOfCurrent + 1;
        }
        int [] result = new int [length];

        int dummy = 0;
        for (int i = 0; i < result.length; i++) {
            if (integers.length > i) {
                dummy += integers[i];
            }
            if (secondNumber.integers.length > i) {
                dummy += secondNumber.integers[i];
            }
            result[i] += (dummy % 10);
            dummy = dummy /10;
        }

        String theNumber = "";
        for(int i : result)
        {
            theNumber.concat(i + "");
        }
        return new LargeInteger(theNumber);
    }
}