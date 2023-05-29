package loops.nested_loops;

public class NestedLoopsDemo {
    public static void main(String[] args) {
        System.out.println("================ nested loops");
        for (int i = 0; i < 5; i++) {
            System.out.println("*** i = " + i + " ***");
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
