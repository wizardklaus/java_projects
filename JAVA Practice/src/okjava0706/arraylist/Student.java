package okjava0706.arraylist;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private ArrayList<Score> scores;
	
	public Student(int id, String name){
		this.id=id;
		this.name=name;
		scores=new ArrayList<Score>();
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

	public ArrayList<Score> getScores() {
		return scores;
	}

	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}
}
