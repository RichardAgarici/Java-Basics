package methods.variable_length_arguments;

public class VarargsDemo {
    public static void main(String[] args) {

    }

    private static int sum(int i1, int i2) {
        return i1 + i2;
    }

    private static int sum(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    private static int sum(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

//    private static void demoVarargsIncorrect(int... i, String s){
//    }
    /**
     * this type of var args will produce compilation errors because we initialise an array of args and also
     * a simple one. The arguments must be switched.
     */

    private static void demoVarargs(String s, int... i ){

    }
}
