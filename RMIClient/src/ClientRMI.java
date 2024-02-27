import java.rmi.Naming;
import java.util.ArrayList;



public class ClientRMI {
	public static void main(String[] args) {
		try {
			Device stub=(Device) Naming.lookup("rmi://localhost:1099/BK");
			System.out.println(stub.Change(9000));
			System.out.println("*************Consultation d'un compte à distante************");
			Compte cp =stub.consulterCompte (1);
			System.out.println("Code= "+cp.getCode());
			System.out.println("Solde= "+cp.getSolde());
			System.out.println("Date= "+cp.getDateC());
			System.out.println("*********************Liste des comptes*********************");
			ArrayList<Compte> cptes=stub.ListeCompte();
			for(Compte c:cptes)
			{
				System.out.println("..................................");
				System.out.println("Code= "+c.getCode());
				System.out.println("Solde= "+c.getSolde());
				System.out.println("Date= "+c.getDateC());
			}
		}
		catch(Exception e)
		{}
	}
}
