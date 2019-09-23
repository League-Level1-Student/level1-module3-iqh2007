package _05_netflix;

public class Netflix {
	public static void main(String[] args) {
		
		
		Movie m1 = new Movie("Air Disasters", 2);
		Movie m2 = new Movie("Chasing Coral", 4);
		Movie m3 = new Movie("Ghosts of the Mountains", 3);
		Movie m4 = new Movie("The Mark of Athena", 5);
		Movie m5 = new Movie("The Lightning Thief",1);
		
		
		m1.getTicketPrice();
		m2.getTicketPrice();
		m3.getTicketPrice();
		m4.getTicketPrice();
		m5.getTicketPrice();
		
		
		NetflixQueue n1 = new NetflixQueue();
		
		
		n1.addMovie(m1);
		n1.addMovie(m2);
		n1.addMovie(m3);
		n1.addMovie(m4);
		n1.addMovie(m5);
		
		n1.printMovies();
		
		n1.getBestMovie();
		
		System.out.println("The best movie is " + n1.getBestMovie());
		System.out.println("The second best movie is " + n1.getSecondBestMovie());
		
		
	}
}
