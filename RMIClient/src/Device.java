import java.util.ArrayList;
import java.rmi.*;
public interface Device extends Remote {
public double Change(double s) throws RemoteException;
public Compte consulterCompte(int code) throws RemoteException;
public ArrayList<Compte> ListeCompte() throws RemoteException;
}
