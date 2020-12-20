package Assignment1;

public class promopackage {
	
	
	public class japanpromo{
		

		
		String price; String date ;
		String p;
		String a;
		
		japanpromo(){
			
			System.out.println("Our Japan Sakura Season Promotion");
			this.price="RM2000";
			this.date= "1 April until 28 April 2021 ";
			
		}
		
		public void setAirline(String airline) {
			this.p = airline;
		}
		
		public String getAirline() {
			return p;
		}
		
		public void setPromo(String promo) {
			this.a = promo;
		}
		
		public String getPromo() { 
			return a;
	
		}
		
		
		
	
	
	public class switzerpromo{
		
		String price; String date;
		String p;
		String a;
		
		switzerpromo(){
			
			System.out.println("Our California Beach sea water surfing promotion ");
			this.price="RM3000";
			this.date= "1 June until 31 August 2021 ";
			
			
		}
		public void setAirline(String airline) {
			this.p = airline;
		}
		
		public String getAirline() {
			return p;
		}
		
		public void setPromo(String promo) {
			this.a = promo;
		}
		
		public String getPromo() { 
			return a;
	
		}
		
		
	}

	

}
	
}
