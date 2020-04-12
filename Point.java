class Point {
	String id;
	String color;
	double x, y;
	
	public Point(String id, double x, double y){
		this.id = id;
		this.x = x;
		this.y = y;
	}
	

	//TODO add new variable

	//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		if (xDirection == "R")
			x++;
		if (xDirection == "L")
			x--;
		if (yDirection == "U")
			y++;
		if (yDirection == "D")
			y--;
	}

	public void draw () {
		System.out.println("Point " + id + ": " + this.x + ", " + this.y);
	}
}