package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int result = 0;
        int result1 = 0;
        for (int i = 1; i <= lastInRow; i++){
            result1 += i;
            if (numberToSkip > lastInRow){
                System.out.println("number to skip is bugger then the last");
            }else if (lastInRow < 0){
                System.out.println("last number in row is negative");
            }else{
                if (i != numberToSkip){
                    result += i;
                    System.out.println("skipped sum is number" + result1 + "counted sum is number" + result);
                }
            }
        }
    }
}
