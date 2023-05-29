package methods.recursive_methods;

/**
 * Recursive methods are ones which call themselves over and over.
 * if we don't code it right, we might get into infinite loops.
 */

public class RecursiveMethodsDemo {
    public static void main(String[] args) {
//        callTheSameMethod();
        System.out.println("3! = " + calculateFactorial(3));
        System.out.println("4! = " + calculateFactorial(4));

        System.out.println("iterativeFactorial(4): "+iterativeFactorial(4));
    }

//    private static void callTheSameMethod(){
//        callTheSameMethod();
//    } // this causes stack overflow error. ( infinite )

    private static int calculateFactorial(int i) {
        if (i != 0) {
            return i * calculateFactorial(i - 1);
        } else {
            return 1;
        }
    }

    /**
     * factorial calculation.
     */
    private static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= 1;
        }
        return factorial;
    }


}
