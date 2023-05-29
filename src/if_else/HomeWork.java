package if_else;

public class HomeWork {
    public static void main(String[] args) {

        String inputArguments = String.join(",", args);
        String adminFlag = "--admin";
        String guestFlag = "--guest";
        if(inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)){
            System.out.println("Please, select either 'ADMIN' or  " + "'Guest' mode for this program");
        } else if (inputArguments.contains(adminFlag)) {
            System.out.println("Hello, Admin!");
        } else if (inputArguments.contains(guestFlag)) {
            System.out.println("Hello, Guest!");
        }


        if(args[0].contains(".") || args[1].contains(".")) {
            double paramDouble1=Double.parseDouble(args[0]);
            double paramDouble2=Double.parseDouble(args[1]);
            System.out.println(paramDouble1+paramDouble2);
        }else {
            int paramInt1 = Integer.parseInt(args[0]);
            int paramInt2 = Integer.parseInt(args[1]);

            System.out.println(paramInt1+paramInt2);
        }

    }
}
