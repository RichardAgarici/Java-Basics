package strings;

public class StrignDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("===== String mode =====");
        System.out.println();

        String s = " hello ";
//===================================================================================

//        System.out.println("s.length(): "+s.length()); // aici returneaza integer
//
//====================================================================================

//        System.out.println("s.contains(\"he\") :" +s.contains("he")); // s.contains returneaza intotdeauna un boolean. iar he in "" trebuie pus cu \ altfel
        //se interpreteaza ca un alt String

//======================================================

//        System.out.println("s.isEmpty: "+s.isEmpty()); // returneaza un boolean daca array-ul de stringuri din care este format cuvantul este egal cu [0];

//======================================================

//        System.out.println(s.toUpperCase()); //modifica toate literele din string sa fie scrise cu litera mare

//======================================================

//        System.out.println(s.startsWith("h")); // este un boolean care verifica daca array-ul de stringuri incepe sau nu cu caracterul prescris. se respecta key sensitivity

//=======================================================

//        System.out.println(s.endsWith(" ")); // idem starts

//=========================================================

//        System.out.println(s.replace("ff","LL")); // aici este o metoda cu 2 paramentri, primul parametru este evident un boolean care este conditionat ca ll sa existe in sting

//=========================================================

//        System.out.println(s.trim()); // trim-ul efectiv sterge toate spatiile din string si returneaza un nou string

//=========================================================

//        System.out.println(s.strip());

//=========================================================

        System.out.println(s.intern().trim().length());
    }
}
