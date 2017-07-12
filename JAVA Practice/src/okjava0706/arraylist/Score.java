package okjava0706.arraylist;

public class Score {
	private int id;
	private String subject;
	private int score;
	
	public Score(String subject, int score){
		this.subject=subject;
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
