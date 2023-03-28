package primitivetypes;

import java.util.Arrays;

public class PrimitiveAndReferenceTypesComparison {

    public static void main(String[] args) {

        int int1 = 128;
        int int2 = 128;

        System.out.println("int1==int2: " + (int1 == int2)); //true
        System.out.println(" 1==2: " + (1 == 2)); //false
        System.out.println("65=='A': " + (65 == 'A')); //True because the char A is on the 65th position in the ascii code line

        Integer i = 128;
        Integer i2 = 128;

        System.out.println("i==i2: " +(i==i2)); //false
        //becasue Integer is a reference type with the value of 128, but in the memory it's alocated a different type
        //of memory
        //e ca si cum ai compara 2 popescu de la aceeasi adresa. sunt persoane diferite

        Integer i3=127;
        Integer i4=127;

        System.out.println("i3 == i4: "+(i3==i4)); //true

//        Integer i5 = new Integer(127);
        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);

        System.out.println("i7==i8: "+(i7+i8));//true

        System.out.println("i.equals(i2): "+i.equals(i2)); //true

        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

        System.out.println("arr1==arr2: "+(arr1==arr2));//false
        System.out.println("arr1.equals(arr2): "+arr1.equals(arr2));//false
        System.out.println("Arrays.equals(arr1, arr2) "+ Arrays.equals(arr1,arr2));

        arr1=arr2; // aici arr2 isi modifica referinta in arr1

        System.out.println(arr1==arr2); // de aia aici e adevarat, deoarece amandoua reference types au aceeasi referinta.


    }

}
