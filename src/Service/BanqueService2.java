package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService2
{
	public double conversion(double montant)
	{
		return montant*3.36;
	}
	Compte compte= new Compte(1, 100,new Date());
	public Compte getCompte()
	{
		return compte;
	}
	public List <Compte> getComptes()
	{
		List <Compte> comptes=new ArrayList();
		Compte c1= new Compte(2, 100,new Date());
		Compte c2= new Compte(3, 100,new Date());
		comptes.add(c1);
		comptes.add(c2);
		return comptes;
	}
	
	
	public static void main(String[] args) 
	{
		BanqueService2 bs =new BanqueService2();
		double montant=5;
		bs.conversion(montant);
		System.out.println(montant);
		
		
	}
	

}
