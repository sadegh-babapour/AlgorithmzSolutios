import org.w3c.dom.Node;

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        String input = new String("100,200,+,100,/,17,+,101,*");
        System.out.println(reversePolish(input));

    }

    static int reversePolish(String weirdnotation)
    {
        int tempSum = 0;
        String tempDigit = new String();
        MyStack myStack = new MyStack();

        for (int i = 0; i < weirdnotation.length(); i++)
        {

            char character = weirdnotation.charAt(i);

            String stringOfChar = String.valueOf(character);
//            System.out.println(stringOfChar);
            if (character == ',')
            {
                tempDigit = "";
                continue;
            }
            else if (Character.isDigit(character))
            {
                while (Character.isDigit(character))
                {
                    tempDigit = tempDigit.concat(character + "");
                    character = weirdnotation.charAt(++i);
                }
                myStack.push(Integer.parseInt(tempDigit));
                tempDigit="";
            }
            else
        {

            int first = myStack.pop().getData();
            int second = myStack.pop().getData();

            tempSum = 0;
//            String stringOfChar = String.valueOf(character);

            switch (stringOfChar)
            {
                case "+":
                    tempSum += (first + second);
                    myStack.push(tempSum);
                    break;
                case "*":
                    tempSum += (first * second);
                    myStack.push(tempSum);
                    break;
                case "/":
                    tempSum += (second / first);
                    myStack.push(tempSum);
                    break;
                default:
                    tempSum += (second - first);
                    myStack.push(tempSum);
                    break;
            }

        }
//            System.out.println(myStack);

        }
        return tempSum;
    }
}
