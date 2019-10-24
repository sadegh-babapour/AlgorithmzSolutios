import java.util.ArrayList;
import java.util.HashMap;

public class Application
{
    public static void main(String[] args)
    {
        int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] alice = {5, 25, 50, 103};
//        int [] results = climbingLeaderboard(scores, alice);
        HashMap<Integer, Integer> qq = climbingLeaderboard(scores, alice);
//        for (int value : qq)
//            System.out.println(value);

        qq.entrySet().forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));

    }

    static HashMap<Integer, Integer> climbingLeaderboard(int[] scores, int[] alice)
    {
        ArrayList aliceRanks = new ArrayList(alice.length);

        HashMap scoreToRank = new HashMap();
        int rank = 0;
        for (int i = 0; i < scores.length; i++)
        {
            if (i == scores.length)
            {
                if (scores[i] == scores[i - 1])
                    break;
                else
                    rank++;
            } else
            {
                if (i != 0 && scores[i] == scores[i - 1])
                {
                    continue;
                } else
                {
                    rank++;
                }

            }
            scoreToRank.put(scores[i], rank);
        }


        for (int i : alice)
            aliceRanks.add(binarySearch(scores, i));



        aliceRanks.forEach(x -> System.out.println(x));
        System.out.println("================");
        return scoreToRank;

    }
    public static int binarySearch(int[] scores, int a) {
        int left = 0;
        int right = scores.length - 1;

        while (left <= right) {
            int m = (left + right) / 2;
            if (scores[m] == a) {
                return m;
            } else if (scores[m] < a) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        if(left == 0)
            left = 1;
        return left;
    }
}
