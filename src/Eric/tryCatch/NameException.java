package Eric.tryCatch;

import Daniel.Exceptions.Items;

public class NameException extends Exception{
    public NameException(String item) {
        super(item + " too short");
    }


}
