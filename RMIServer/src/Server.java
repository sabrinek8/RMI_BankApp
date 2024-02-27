import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
 
public class Server  {

	public static void main(String[] args) {
		try
		{
			LocateRegistry.createRegistry(1099);
			Obj CompteObj=new Obj();
			System.out.println(CompteObj.toString());
			Naming.rebind("rmi://localhost:1099/BK", CompteObj);
		}
    catch(Exception e)
		{//e.printStackTrace();}
	}

}}
