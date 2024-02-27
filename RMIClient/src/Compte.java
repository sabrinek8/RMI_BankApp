import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
private int code;
private double solde;
private Date dateC;

public Compte(int code, double solde, Date dateC) {
	
	this.code = code;
	this.solde = solde;
	this.dateC=dateC;
	
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Date getDateC() {
	return dateC;
}
public void setDateC(Date dateC) {
	this.dateC = dateC;
}



}
