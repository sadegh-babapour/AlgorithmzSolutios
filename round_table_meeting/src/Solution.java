import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String args[]) throws Exception
    {

        //Scanner
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int numberOfQueries = s.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = s.nextInt();
        }

        for (int i = 0; i < numberOfQueries; i++)
        {
            System.out.println(mateFinder(numbers, s.nextInt(), s.nextInt()));
        }

    }

    public static int mateFinder(int[] roundTable, int valuueOne, int valueTwo)
    {
        List<Integer> valueOnePositions = new ArrayList<>();
        List<Integer> valueTwoPositions = new ArrayList<>();

        for (int index = 0; index < roundTable.length; index += 1)
        {
            if (roundTable[index] == valuueOne)
                valueOnePositions.add(index);
            else if (roundTable[index] == valueTwo)
                valueTwoPositions.add(index);
        }
        return findMinDistance(valueOnePositions, valueTwoPositions, roundTable.length);
    }

    public static int findMinDistance(List<Integer> first, List<Integer> second, int length)
    {
        List<Integer> firstOne = new ArrayList<>();
        List<Integer> secondOne = new ArrayList<>();

        if (first.size() >= second.size())
        {
            firstOne = first;
            secondOne = second;
        } else
        {
            firstOne = second;
            secondOne = first;
        }
        List<Integer> distance = new ArrayList<>();

        for (int i : firstOne)
        {
            for (int j : secondOne)
            {
                if (i >= j)
                {
                    distance.add(i - j);
                    distance.add(Math.abs(i - j - length));
                } else
                {
                    distance.add(j - i);
                    distance.add(Math.abs(j - i - length));

                }
            }
        }

        return Collections.min(distance) / 2;


    }
}
