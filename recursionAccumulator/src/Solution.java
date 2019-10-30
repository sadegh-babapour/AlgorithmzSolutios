public class Solution
{
//    static int count = 0;


    public static void main(String[] args)
    {

        mystery2(10,0);

    }

    public static void mystery2(int n, int count)
    {

        count++;
        System.out.println("We have called this " + count + "times before...");
        if (n <= 1)
            System.out.print(n);
        if (count == 2)
            return;

        else
        {
            mystery2(n / 2, count);
            System.out.print(", " + n);
        }

    }
}
