import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution
{

    // it is not optimizied, but it worls, and is easy to understand;

    // may come back to do the recursive later.



    public static boolean canWin(int leap, int[] game)
    {
        if (leap > game.length)
            return true;

        List<Integer> visited = new ArrayList<>();
        visited.add(0);
        for (int i = 0; i < game.length; i++)
        {

            if (i + leap >= game.length)
                return true;
            if (i > 0 && game[i + 1] == 1 && game[i + leap] == 1 && game[i - 1] == 1)
                return false;


            if (game[i + leap] == 0)
            {
                i += leap - 1;
                visited.add(i + 1);

            } else if (game[i + 1] == 0)
            {
                if (visited.contains(i + 1) && (i-2) >=0)
                    i -=2;
                visited.add(i + 1);
            } else
            {
                i -= 2;

                if (visited.contains(i) || i < 0)
                    return false;
                visited.add(i + 1);
            }
            System.out.println(Arrays.toString(visited.toArray()));

        }
        return false;
    }

    public static void main(String[] args) throws Exception
    {



        int [] game = {0 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,1};
        int leap = 7;

        System.out.println((canWin(leap, game)) ? "YES" : "NO");

//        File text = new File("C:\\Users\\TheMightyLobster\\Documents\\java_repoz" +
//                "\\theGithubPortfolio\\AlgorithmzSolutios\\HackerrankJava1DArrayJump\\src\\input" +
//                ".txt");
//
//        Scanner scan = new Scanner(text);
//        int q = scan.nextInt();
//        int wwe = 0;
//        while (q-- > 0)
//        {
//
//            wwe++;
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
////            System.out.println(wwe);
//            for (int i = 0; i < n; i++)
//            {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println((canWin(leap, game)) ? "YES" : "NO");
//        }
//
//        scan.close();

}
}


//slow and forever for some cases
//public static boolean canWin(int leap, int[] game)
//{
//    int myLength = game.length;
//    if (leap >  myLength)
//        return true;
//    int position = 0;
//    for (int i = 0; i < myLength - leap; i++)
//    {
//        if (position >= myLength || position + leap >= myLength)
//            return true;
//        if (game[i + leap] == 0)
//        {
//            position += leap;
//            i += leap-1;
//            if (position + leap >= myLength)
//                return true;
//        }
//        else if (game[i+1] == 0)
//        {
//            ++position;
//            if (position + leap >= myLength)
//                return true;
//        }
//        else
//        {
//            if (i - 2 > 0 && game[i - 1] == 0)
//            {
//                position--;
//                i -= 2;
//                if (game[i + leap] == 0)
//                {
//                    position += leap;
//                    i += leap-1;
//                    if (position + leap >= myLength)
//                        return true;
//                }
//            }
//            else
//                break;
//        }
//    }
//    return false;
//
//}
//
//
//
//    int myLength = game.length;
//        if (leap > myLength)
//                return true;
//                int position = 0;
//                ArrayList<Integer> visited = new ArrayList<>();
//
//
//        for (int i = 0; i < myLength - leap; i++)
//        {
//        System.out.println(i);
//        if (position >= myLength || position + leap >= myLength)
//        return true;
//
//
//        if (game[i + leap] == 0)
//        {
//        position += leap;
//        i += leap - 1;
//        visited.add(position);
//
//        if (position + leap >= myLength)
//        return true;
//
//        } else if (game[i + 1] == 0)
//        {
//        ++position;
//        visited.add(position);
//
//        if (position + leap >= myLength)
//        return true;
//        } else
//        {
//        if (i - 2 > 0 && game[i - 1] == 0 && )
//        {
//        position--;
//        i -= 2;
//
////                    if (game[i + leap + 1] == 0)
////                    {
////                        position += leap;
////                        i += leap - 1;
////                        if (position + leap >= myLength)
////                            return true;
//        }
//        else
//        break;
//        }
//        for (int k : visited)
//        System.out.print(k);
//
//        }
//        return false;
//        }