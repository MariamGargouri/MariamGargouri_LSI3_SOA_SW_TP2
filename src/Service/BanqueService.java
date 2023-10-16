package Service;

public class BanqueService
{
	public double conversion(double montant)
	{
		return montant*3.36;
	}
	public static void main(String[] args) 
	{
		BanqueService bs =new BanqueService();
		double montant=5;
		bs.conversion(montant);
		System.out.println(montant);
		
		
	}
	

}
