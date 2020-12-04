public class StringFormatSpec {
    public static void main(String[] args) {
        int david = 17, dawson = 15, dillon = 8, gordon = 6;

        // old school Concatenation
        String s1 =  "My nephews are " + david + ", " + dawson + ", " + dillon + ", and " + gordon + " years old";
        // improvement Formatting
        String s2 = String.format("My nephew are %d, %d, %d and %d years old", david, dawson, dillon, gordon );
        System.out.println(s2);
        System.out.println(s1);

        // going further
        double avgDiff = ((david -dawson) + (dawson - dillon) + (dillon -gordon)) / 3.0;
        String s3 = String.format("The average age between each is %.1f years", avgDiff);
        System.out.println(s3);
    }
    // specs for the format Specifier..  the common ones
    // "%d" Decimal 32 is 32
    // "%x" Hex 32 is 20
    // "%.[X]f" floating point number this 'X' is the number on integers you want to show after the decimal. %.1f = 1.8 "


    /*Format Flags
    Flag
    # Radis ex:
    . decimal
    **/
    String s4 = String.format("%#x", 32);
    // output is 0x20 this is a hex format
    int w =5, x = 235, y = 481, z = 12;

    // flag 0 zero-padding
    String s5 = String.format("W:%04d X:%04d", w, x);
    String s6 = String.format("Y:%04d Z:%04d", y, z);
    //output adds four 0 to the values

    // flag - Left justify



    // flag  , group separator
    int val =  1234567;
    double dVal = 1234564.0d;
    String s7 = String.format("%d", val);
    // output is 1234567
    String s8 = String.format("%,d", val);
    // output is 1,234,567
    String s9 = String.format("%,.2f", dVal);
    // output is 1,234,567.00

    // flag Space, + and (

    int posVal = 123, negVal = -456;

    String s10 = String.format("% d", posVal);
    String s11 = String.format("% d", negVal);
    // output will align both string
    String s12 = String.format("%+d", posVal);
    String s13 = String.format("%+d", negVal);
    // output will add + and - symbol to the positive values
    String s14 = String.format("%(d", posVal);
    String s15 = String.format("%(d", negVal);
    // output will add () around the negative number


    // Argument Index

    int valA = 100, valB = 200, valC = 300;

// no arguments applied
    String s16 = String.format("%d %d %d", valA, valB, valC);
    //  100, 200, 300
    // $ allows you to bind to a certain argument
    String s17 = String.format("%3$d, %1$d, %2$d", valA, valB, valC);
    // 300, 100, 200
    // < the less than operator lets you take on the last argument
    String s18 = String.format("%2$d %<d %1$d %3$d", valA, valB, valC);
    //200 200 100 300





}
