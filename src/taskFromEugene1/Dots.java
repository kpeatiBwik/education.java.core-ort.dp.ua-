package taskFromEugene1;

public class Dots {

	private String dotName;
	private int x;
	private int y;

	public String getDotName() {
		return dotName;
	}

	public void setDotName(String dotName) {
		this.dotName = dotName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Dots(String dotName, int x, int y) {
		this.dotName = dotName;
		this.x = x;
		this.y = y;
	}
}
