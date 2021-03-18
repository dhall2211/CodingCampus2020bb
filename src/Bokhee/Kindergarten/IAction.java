package Bokhee.Kindergarten;


import java.util.Vector;

public interface IAction {
    public void doOwnThing(Vector<IAction> actionPartners);
    public void interaction(IAction partner);
}

