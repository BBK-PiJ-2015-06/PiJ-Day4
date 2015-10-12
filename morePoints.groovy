class Point {

	double x;
	double y;
	
	double distanceTo(Point point) {
		double dx = Math.abs(point.x - this.x)
		double dy = Math.abs(point.y - this.y)
		double distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
		return distance;
	}

	double distanceToOrigin() {
		Point origin = new Point();
		origin.x = 0;
		origin.y = 0;
		double distance = distanceTo(origin);
		return distance;
	}
	
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point point) {
		this.x = point.x;
		this.y = point.y;
	}
	
	Point clone() {
		Point copy = new Point();
		copy.moveTo(this.x,this.y);
		return copy;
	}
	
	Point opposite() {
		Point copy = new Point();
		copy.moveTo(this.x * -1,this.y * -1);
		return copy;
	}
	
}
