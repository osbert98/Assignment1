package Assignment1;

public class bookinginfo {

	String firstname;
	String lastname;
	String gender;
	String promo;

	bookinginfo (String firstname,String lastname,String gender,String promo){
		this.firstname=firstn;
		this.lastname=lastN;
		this.gender=gender;
		this.promo=promo;
	}
	
	public void setFirstname(String firstN) {
		this.Firstname=firstN;
	}
	public void setLastname(String lastN) {
		this.Lastname=lastN;
	}
	public void setRace(String race) {
		this.race=race;
	}
	public void setgend(String gender) {
		this.Gender=gender;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	public String getGender() {
		return Gender;
	}
	public String getRace() {
		return race;
	}
	
	public String toString() {
		return "Participant name : "+Firstname+" "+Lastname+"\nGender : "+Gender+"\nRace :"+race;
	}
}
	
	
}
