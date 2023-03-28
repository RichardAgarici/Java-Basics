package refactoringdemo;

public class RefactoringDemo2 {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        int i = 10;
        System.out.println("Some code that are not aligned");
        int i1 = 10 + 5;
        System.out.println(i1);
        System.out.println(i1);
    }
}
