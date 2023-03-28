package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigD {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(i / 3);
        System.out.println(i - (6 * 3));
        System.out.println((double) i / 3);

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2); //= this is called factoring method;
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson); // o sa iasa 6,67 deoarece .setScale(2) a facut ca numarul sa aibe doar 2 zecimale
        // daca nu punem rotunzire, throws aritmethic expection

        double d = 3.1;
        double d2 = 1.21;
        System.out.println(d-d2);

        BigDecimal bd3=BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4=BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3.subtract(bd4)); // 1.89

        //substract este practic "scoate bucata aia perfect cu 2 zecimale" = minus cu 2 zecimale
    }

    // it provides exact manipulation of big data numbers.
    // it gives complete control over rounding behaviour
    // if the round cannot be perfect, it throws an exeption

}
