package etiyaGamesLayered.entities.concretes;


public class Gamer extends User {

public double score;

public Gamer() {
	super();
}

public Gamer(String firstName, String lastName, int birthYear, String identityNumber, String gender, double score) {
	super(firstName, lastName, birthYear, identityNumber, gender);
	this.score = score;
}

public double getScore() {
	return score;
}

public void setScore(double score) {
	this.score = score;
}



}
