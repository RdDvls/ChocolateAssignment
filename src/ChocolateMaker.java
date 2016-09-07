/**
 * Created by RdDvls on 9/1/16.
 */
public class ChocolateMaker {
    public int makeChocolate(int small, int big, int goal) {
        {
            int x = big * 5;
            if (x == goal)
                return 0;
            else if (x < goal) {
                if ((x + small) < goal)
                    return -1;
                else if ((x + small) == goal)
                    return small;
                else
                    return goal - x;
            } else {
                while (x > goal) {
                    x -= 5;
                }
                if (x + small < goal)
                    return -1;
                else
                    return goal - x;
            }
        }
    }
}
