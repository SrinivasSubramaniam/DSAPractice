package personalPracticeProblems;

public class ScoreNew {

	public int id;
	
	public String name;
	public double score;

	public ScoreNew(int id, String name, double score) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.score=score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String toString()
	{
		return this.id+ " "+this.name+" "+this.score;
	}

}
