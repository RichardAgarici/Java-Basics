package math;

public class MathClassDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.sqrt(4));
        int absolutValue = Math.abs(-5);
        System.out.println(absolutValue);

        //NaN - not a number

        System.out.println(Math.sqrt(-1));
        System.out.println(0 / 0.0);
        System.out.println((0 / 0.0) + 5);

        System.out.println(5 / 0.0); //infinity
        System.out.println(-5 / 0.0); //-infinity

        System.out.println(Math.random()); // random between 0 and 1.0
        System.out.println((int) (Math.random() * 100)); // random between 1 - 100;
        System.out.println((int) (Math.random() *100) +100); //random between 100 and 200




    }
}
