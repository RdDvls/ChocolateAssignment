/**
 * Created by RdDvls on 9/1/16.
 */
public class ChocolateMaker {
    public int makeChocolate(int small, int big, int goal) {
        if(goal<5 && small>=goal) {
            return goal;
        }
        if(goal<5 && small<goal) {
            return -1;
        }
        if(goal>=5) {
            if(5*big>goal) {
                int temp=goal/5;
                if(goal-temp*5<=small) {
                    return goal-temp*5;
                }
                if(goal-temp*5>small) {
                    return -1;
                }
            }

            if(5*big<goal) {
                if(small<(goal-5*big)) {
                    return -1;
                }
                if(small>=(goal-5*big)) {
                    return goal-5*big;
                }
            }
        }
        return goal;
    }

}
