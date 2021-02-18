package Irene.skirental;

public class TestException extends Exception {
    public TestException(Category item) {super(item.name() + " this is a test.");}
}
