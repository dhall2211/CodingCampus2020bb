package Bokhee.tryCatch;

public class NameException extends Exception{
    public NameException(String item) {
        super(item + " too short");
    }


}
