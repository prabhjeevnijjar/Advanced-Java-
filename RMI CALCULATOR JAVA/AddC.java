import java.rmi.server.*;
public class AddC extends UnicastRemoteObject implements AddI
{
    public AddC() throws Exception {
            super();                //constructor handles exceptions
    }
    public int Add(int x, int y) {
        return x+y;
    }
    public int Sub(int x, int y) {
        int a=x,b=y;
        if(a < b) {
            return -1;
        } else {
        return x-y;
        }
    }
    public int Mul(int x, int y) {
        return x*y;
    }
    public int Div(int x, int y) {
        return x/y;
    }
}