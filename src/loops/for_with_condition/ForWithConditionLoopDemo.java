package loops.for_with_condition;

public class ForWithConditionLoopDemo {
    public static void main(String[] args) {
        System.out.println("============== for loop");
        for (int i =0; i<5;i++)
            System.out.println("counter"+ i);

        // Infinite loop
//        for(;;){
//
//        }

        System.out.println("============ for loop | comma usage example");
        for (int i = 0, j=11; i<=j; i++,j--){
            System.out.println("counters: i= "+i+", j= "+j );
        }
    }
}
