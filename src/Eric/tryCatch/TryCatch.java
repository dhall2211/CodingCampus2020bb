package Eric.tryCatch;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {

        var userInput = getUserNumber();
        System.out.println(userInput);
        var userName = getUserNameAgain();
        System.out.println(userName);

    }

    public static int getUserNumber() {
        int userInput = 0;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter id");
                userInput = scanner.nextInt();
                return userInput;
            } catch (Exception e) {
                System.out.println("error ");
            }
        }
    }

    public static String getUserFirstName() throws Exception {
        String userInput = "";

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter name");
                userInput = scanner.next();
                if (userInput.length() <= 3) {
                    throw new Exception("Error: your name is too short");
                } else {
                    return userInput;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getName() {
        var userInput = "";
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter name");
            userInput = scanner.next();
            if (userInput.length() <= 3) {
                throw new Exception("Error: your name is too short");
            } else {
                return userInput;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getUserNameAgain() {
        String getNameBefore = "";

        while (getNameBefore.isEmpty()) {
            getNameBefore = getName();
        }
        return getNameBefore;
    }
}
