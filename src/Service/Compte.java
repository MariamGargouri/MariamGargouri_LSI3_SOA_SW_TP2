package Service;
import java.util.Date;
public class Compte {
	
private int code , solde;
private Date date;
	
	public Compte (int code, int solde, Date date)
	{
		this.code=code;
		this.solde=solde;
		this.date=date;
	}
	public int getCode() 
	{
	return code;
	}
	public void setCode(int code) 
	{
	this.code = code;
	}
	public int getSolde() 
	{
	return solde;
	}
	public void setSolde(int solde) 
	{
	this.solde = solde;
	}
	public Date getDate() 
	{
	return date;
	}
	public void setDate(Date date) 
	{
	this.date = date;
	}


	public static void main(String[] args) 
	{
	}
}
