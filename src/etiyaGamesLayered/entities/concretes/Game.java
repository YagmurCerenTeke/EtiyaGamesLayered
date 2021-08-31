 package etiyaGamesLayered.entities.concretes;

import etiyaGamesLayered.entities.abstracts.Entity;

public class Game implements Entity{
private int id;
private String name;
private double price;
private double totalScore;

public Game() {
	super();
}

public Game(int id, String name, double price, double totalScore) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.totalScore = totalScore;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double getTotalScore() {
	return totalScore;
}

public void setTotalScore(double totalScore) {
	this.totalScore = totalScore;
}

}
