package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int temp = 3;
        for (int i = 1; i <= lastPrinted; i++){
            if (i == temp){
                continue;
            }
            temp += 3;
            System.out.println(i);
        }
    }
}
