
public class Athlete {

	static String raceLocation = "New York";
	static int nextBibNumber;
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;
	
	static int nextNumber=0;
	
	Athlete() {
		this.bibNumber = nextNumber;
	}
	
	
	Athlete a1 = new Athlete();
	
	Athlete a2 = new Athlete();
	
	Athlete a3 = new Athlete();
	
	

	public static void main(String[] args) {
		// create two athletes
		// print their names, bibNumbers, and the location of their race.
	}
}
