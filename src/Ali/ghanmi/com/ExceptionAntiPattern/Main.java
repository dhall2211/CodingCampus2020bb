package Ali.ghanmi.com.ExceptionAntiPattern;

public class Main {
    public static void main(String[] args) {
        int result1 = func1(0);
        if (result1 < 0){
            System.out.println("Func 1 ist schief gelaufen");
        } else {
            int result2 = func2(result1);
            if (result2 < 0) {
                System.out.println("Func 2 ist schief gelaufen");
            } else {
                int result3 = func3(result2);
                if (result3 < 0) {
                    System.out.println("Func 3 ist schief gelaufen");
                } else {
                    int result4 = func4(result3);
                    if (result4 < 0){
                        System.out.println("Func 4 ist schief gelaufen");
                    } else {
                        int result5 = func5(result4);
                        if (result5 < 0) {
                            System.out.println("Func 5 ist schief gelaufen");
                        } else {
                            System.out.println("Result = " + result5);
                        }
                    }
                }
            }
        }
    }


    public static int func1(int param){
        return 1;
    }

    public static int func2(int param){
        return 2;
    }

    public static int func3(int param){
        return 3;
    }

    public static int func4(int param){
        return 4;
    }

    public static int func5(int param){
        return 5;
    }


}
