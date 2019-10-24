package biginteger;

import java.util.Arrays;

public class LargeInteger
{
    private int [] integers;

    public LargeInteger(LargeInteger input)
    {
        this.integers = input.integers;
    }
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
        String theNumber = "";
        int count = 1;
        for(int i = integers.length -1 ; i >=0; i--)
        {
            theNumber = (integers[i] + "").concat(theNumber);
            count++;
        }
        // kind of a hack especially when calculating large fibonacci's
        // for some reason, the array size gets out of hand

        //*
        // with fibonacci, for each iteration, we are adding an extra space in case the sum over
        // flows and needs to go to the next section, these add up, hence the leading non zeros
        //  will come to fix later

        // this is from some stackover flow guy,


        char[] array = theNumber.toCharArray();
        int arrayLength = array.length;
        int firstNonZeroAt = 0;
        for(int i=0; i<arrayLength; i++) {
            if(theNumber.charAt(i) != '0'){
                theNumber = theNumber.substring(i);
                break;
            }
        }
        char[] newArr = theNumber.toCharArray();
        count = 1;

        String finalNumber = "";
        for(int i = newArr.length -1 ; i >=0; i--) {
            finalNumber = (newArr[i] + "").concat(finalNumber);
            count++;
            if (count % 4 == 0)
            {
                finalNumber = ",".concat(finalNumber);
                count =1;
            }

        }


        return finalNumber;
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