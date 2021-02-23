package Ali.ghanmi.com.ExceptionAntiPattern;

public class Main2 {
    public static void main(String[] args) {
        try {
            int result1 = func1(0);
            int result2 = func2(result1);
            int result3 = func3(result2);
            int result4 = func4(result3);
            int result5 = func5(result4);
            System.out.println("Result = " + result5);
        } catch (Exception e) {
            System.out.println("Es ist schief gelaufen. "+ e);
        }
        System.out.println("Hier normal weiter laufen");
    }


    public static int func1(int param) throws Exception {
        return 1;
    }

    public static int func2(int param) throws Exception {
        return 2;
    }

    public static int func3(int param) throws Exception {
        return 3;
    }

    public static int func4(int param) throws Exception {
        try {
            if (param % 2 == 1) throw new Exception("Parameter ist ungerade.");
        } catch (Exception e){
            System.out.println("Nichts passiert, ich lass es weiterlaufen");
        }
        return 4;
    }

    public static int func5(int param) throws Exception {
        return 5;
    }


}
