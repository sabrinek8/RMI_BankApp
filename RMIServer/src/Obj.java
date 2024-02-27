import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

public class Obj extends UnicastRemoteObject implements Device  {
	public Obj () throws RemoteException {super ();}
	public double Change(double s)throws RemoteException
	{
		return s*3.35;
	}

	public Compte consulterCompte(int cod) throws RemoteException
	{  Compte cp=new Compte(cod,Math.random()*9000,new Date());
				
		return cp;		
				
	}
	public ArrayList<Compte> ListeCompte() throws RemoteException
	{
		 ArrayList<Compte> liste=new ArrayList<Compte>();
		 liste.add(new Compte(2,Math.random()*9000,new Date()));
		 liste.add(new Compte(3,Math.random()*9000,new Date()));
		 liste.add(new Compte(4,Math.random()*9000,new Date()));
		 return liste;
	}

}
