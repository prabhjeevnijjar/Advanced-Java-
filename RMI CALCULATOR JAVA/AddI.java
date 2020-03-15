import java.rmi.Remote;
//interface is created by extending remote interface
public interface AddI extends Remote
{
    public int Add(int x, int y) throws Exception;
    public int Sub(int x, int y) throws Exception;
    public int Mul(int x, int y) throws Exception;
    public int Div(int x, int y) throws Exception;
}