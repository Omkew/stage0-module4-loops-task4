package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int result = 0;
        for (int i = 1; i <= toBreakWith; i++){
            if (numberToGoUntil < toBreakWith){
                System.out.println("iterating till the end");
            }else{
                if (i != toBreakWith){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
