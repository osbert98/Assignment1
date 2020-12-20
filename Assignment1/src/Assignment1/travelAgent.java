package Assignment1;

public class travelAgent {

	public static void main(String[] args) {
		
		bookinginfo b=new bookinginfo("Osbert","Howell","Male","JapanSakuraSeason");
		promopackage a= new promopackage();
		
		System.out.println(b);
		
		a.printPlace();
		a.printSeason();
		a.printAvailable("1 June 2021 until 31 August");
		a.setPrice("RM3000");
		
		//System.out.println("Price of the song: Rm"+p.getPrice());
		
	}
		
	
	

}
