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
            integers[i] = Integer.parseInt(inputNumber.charAt(i) + "");
        }
    }

    @Override
    public String toString()
    {
//        String theNumber = "";
//        for(int i = 0; i < integers.length;i++)
//        {
//            theNumber = theNumber.concat(integers[i] + "");
//        }
//        return theNumber;
        String theNumber = "";
        int count = 1;
        for(int i = integers.length -1 ; i >=0; i--)
        {
            theNumber = (integers[i] + "").concat(theNumber);
            count++;
            if (count % 4 == 0)
            {
                theNumber = ",".concat(theNumber);
                count =1;
            }

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
                dummy += integers[integers.length-1-i];
            }
            if (secondNumber.integers.length > i) {
                dummy += secondNumber.integers[secondNumber.integers.length-1-i];
            }

            result[result.length-1 - i] += (dummy % 10);
            dummy = dummy /10;

        }


        String theNumber = "";

        for(int i : result)

        {
            theNumber = theNumber.concat(i + "");
        }
        return new LargeInteger(theNumber);
    }
}