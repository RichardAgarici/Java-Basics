package enumeration;

public class EnumDemo {
    public static void main(String[] args) {
        Priority priority = Priority.HIGH;
        switch (priority) {
            case HIGH:
                System.out.println("High priority");
                break;
            case MEDIUM:
                System.out.println("Medium priority");
                break;
            case LOW:
                System.out.println("Low priority");
                break;
        }

        System.out.println("===================== Enum value of()");

        Priority priority1 = Priority.valueOf("HIGH");
        System.out.println(priority1);

//        priority1 = Priority.valueOf("High"); // this throws exception IllegalArgumentException: No enum...

        System.out.println("======================= Enum comparison");

        System.out.println("Priority.HIGH == Priority.MEDIUM " + (priority == Priority.MEDIUM));

        System.out.println("Priority.HIGH == Priority.HIGH " + (priority == Priority.HIGH));

        System.out.println("======================= Enum ordinal()");

        System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
        System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());

        System.out.println("======================= Enum iteration");

        Priority[] values = Priority.values();
        for (Priority priority2 : values) {
            System.out.println(priority2);
        }

        System.out.println("\n======================= Enum fields and methods");

        System.out.println("Month.JANUARY.getDaysAmount(): " + Month.JANUARY.getDaysAmount());


    }


}
